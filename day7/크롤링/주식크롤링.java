package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class 주식크롤링 {
	private JTextField textField;
	
	public 주식크롤링() {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		JTextArea result = new JTextArea();
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("\uBAA8\uB098\uBBF8");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360#").get();
					Elements elist = doc.select("span.blind");
					
					result
					System.out.println(elist.get(12).text());
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
		
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0BC\uC131\uC804\uC790");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC13C\uD2B8\uB9AC\uC628");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 32));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("code : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 36));
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uD06C\uB864\uB9C1\uC2DC\uC791");
		f.getContentPane().add(btnNewButton_3);
		
		result.setTabSize(10);
		result.setRows(2);
		f.getContentPane().add(result);
		f.setVisible(true);
			
	}
	

	public static void main(String[] args) {
		주식크롤링 name = new 주식크롤링 ();
		
		

	}

}
