package ����;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.IOException;

public class ��������2 {

	public static void main(String[] args) throws IOException  {

		FileWriter file = new FileWriter("test2.txt");
		
		for(int i = 0 ; i <3 ; i++) {
			String data = JOptionPane.showInputDialog("����2");
			file.write(data+"\n");
		}
			
		//��Ʈ�� ����
		file.close();
		
	}

}
