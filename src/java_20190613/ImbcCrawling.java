package java_20190613;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImbcCrawling {

	public static void main(String[] args) {
		String ur2 = "http://www.imbc.com/";
		
		//��ü HTML������ �����ϱ� ���� ��ü (CTRL+SHIFT+O)
		Document doc = null;
		
		try {
			//url�ּҿ� get ������� ����
			doc = Jsoup.connect(ur2).get();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Elements elements = doc.select(".con-wrap.notice-wrap");
		
		String title = elements.select("h3").text();
		System.out.println(title);

		Elements liEle = elements.select("li");
		for (int i=0; i<liEle.size();i++){
			Element temp = liEle.get(i);
			System.out.println(temp.text());
		}

		//���� �κ��̶� ���� �ڵ��Դϴ�. 
		
	/*	for(Element temp : elements.select("li")){
			System.out.println(temp.text());
		}*/
	}
	
}
