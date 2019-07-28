package 파일;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.IOException;

public class 파일저장2 {

	public static void main(String[] args) throws IOException  {

		FileWriter file = new FileWriter("test2.txt");
		
		for(int i = 0 ; i <3 ; i++) {
			String data = JOptionPane.showInputDialog("파일2");
			file.write(data+"\n");
		}
			
		//스트림 제거
		file.close();
		
	}

}
