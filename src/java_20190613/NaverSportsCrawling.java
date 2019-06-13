package java_20190613;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSportsCrawling {

	public static void main(String[] args) {
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		
		//��ü HTML������ �����ϱ� ���� ��ü (CTRL+SHIFT+O)
		Document doc = null;
		
		try {
			//url�ּҿ� get ������� ����
			doc = Jsoup.connect(url).get();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Elements elements = doc.select(".home_news");
		
		String title = elements.select("h2").text().substring(0,4);
		System.out.println(title);
		
	/*	Element element = elements.select("li");
		System.out.println(element.text());*/
		
		for(Element temp : elements.select("li")){
			System.out.println(temp.text());
		}
		
		
	}
}
