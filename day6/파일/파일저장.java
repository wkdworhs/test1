package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {

	public static void main(String[] args) throws IOException  {
		//외부 자원을 연결함. 
		//파일. db 
		//
		FileWriter file = new FileWriter("test.txt");
		file.write("hello hava"+"\n");
		file.write("hello hava");
		file.close();
	}
	
}
