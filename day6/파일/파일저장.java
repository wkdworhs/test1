package ����;

import java.io.FileWriter;
import java.io.IOException;

public class �������� {

	public static void main(String[] args) throws IOException  {
		//�ܺ� �ڿ��� ������. 
		//����. db 
		//
		FileWriter file = new FileWriter("test.txt");
		file.write("hello hava"+"\n");
		file.write("hello hava");
		file.close();
	}
	
}
