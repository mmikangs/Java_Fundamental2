package java_20190614;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://sports.news.naver.com/kfootball/news/read.nhn?oid=139&aid=0002111712");
		URLConnection urlCon = url.openConnection();

		String server = urlCon.getHeaderField("Server");
		String cacheControl = urlCon.getHeaderField("Cache-Control");
		String expires = urlCon.getHeaderField("Expires");
		String contentType = urlCon.getHeaderField("Content-Type");
		String location = urlCon.getHeaderField("Location");
		String connection = urlCon.getHeaderField("Connection");
		String setCookie = urlCon.getHeaderField("Set-Cookie");
		int len = urlCon.getContentLength();

		System.out.println("server : " + server);
		System.out.println("Cache-Control : " + cacheControl);
		System.out.println("Expires : " + expires);
		System.out.println("Content-Type : " + contentType);
		System.out.println("Location : " + location);
		System.out.println("Connection : " + connection);
		System.out.println("Set-Cookie : " + setCookie);
		System.out.println("len : " + len);

		InputStream in = urlCon.getInputStream();

	}

}
