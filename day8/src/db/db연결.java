package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class db���� {

	public static void main(String[] args) throws Exception {

		//1.Ŀ���� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ���� ok..");
		
		
		//2.db���� 
		
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("2. db���� ����");
		
		
		
		
		//3.sql�� ���� . 
		String id = JOptionPane.showInputDialog("���̵�");
		String pw = JOptionPane.showInputDialog("��й�ȣ");
		String name = JOptionPane.showInputDialog("�̸�");
		String tel = JOptionPane.showInputDialog("��ȭ��ȣ");
		
		String sql = "insert into member values (? , ?, ? , ?)";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		
		System.out.println("3�� ���� ");		
		
		//4.sql�� �����û
		ps.executeUpdate();
		System.out.println("4�� ���� . ");
		
		
		
		
	}

}
