package java_20190613;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BitcoinCrawling {

	public static void main(String[] args) {
		String ur1 = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		
		//전체 HTML문서를 관리하기 위한 객체 (CTRL+SHIFT+O)
		Document doc = null;
		
		try {
			//url주소에 get 방식으로 접근
			doc = Jsoup.connect(ur1).get();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Elements elements = doc.select(".col-xs-12.tab-content");
		
		String title = elements.select("h1").text();
		//System.out.println(title);

		Elements liEle = elements.select("tr");
		for (int i=0; i<liEle.size();i++){
			Element temp = liEle.get(i);
			// System.out.println(temp.text());
		}

		//위에 부분이랑 같은 코드입니다. 
		
	/*	for(Element temp : elements.select("li")){
			System.out.println(temp.text());
		}*/
	}
	
}
