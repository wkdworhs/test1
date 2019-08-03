package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�3 {

	public static void main(String[] args) throws IOException {

		String[] code = { "005360", "005930", "068270" };
		String[] company = { "�𳪹�", "�Ｚ����", "��Ʈ����" };
		
		for(int i = 0 ; i<code.length ; i++) {
						
		Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+code[i]+"#").get();
		Elements elist = doc.select("span.blind");

		System.out.println(company[i]+elist.get(12).text());
		
		FileWriter file = new FileWriter(company[i]+".txt");
		file.write(company[i]+" : "+elist.get(12).text()+"��");
		file.close();
		
		}

	}

}
