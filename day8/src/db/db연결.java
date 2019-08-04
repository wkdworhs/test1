package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class db연결 {

	public static void main(String[] args) throws Exception {

		//1.커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 ok..");
		
		
		//2.db연결 
		
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("2. db연결 성공");
		
		
		
		
		//3.sql문 결정 . 
		String id = JOptionPane.showInputDialog("아이디");
		String pw = JOptionPane.showInputDialog("비밀번호");
		String name = JOptionPane.showInputDialog("이릅");
		String tel = JOptionPane.showInputDialog("전화번호");
		
		String sql = "insert into member values (? , ?, ? , ?)";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		
		System.out.println("3번 성공 ");		
		
		//4.sql문 실행요청
		ps.executeUpdate();
		System.out.println("4번 성공 . ");
		
		
		
		
	}

}
