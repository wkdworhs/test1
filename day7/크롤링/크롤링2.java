package 农费傅;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 农费傅2 {

	public static void main(String[] args) throws Exception  {
		Document doc =    Jsoup.connect("https://www.w3schools.com").get();
		Elements ele = doc.select("span.blind");
		
		System.out.println(ele);
		FileWriter file = new FileWriter("dd.txt");
		
		
	}

}
