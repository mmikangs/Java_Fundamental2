package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class NaverCafeScanningDemo {

	public static void main(String[] args) {
		
		
		
		InputStream in = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
		
			
		URL url = new URL("https://blog.naver.com//PostView.nhn?blogId=jhkbbb9&logNo=221560226889&redirect=Dlog&widgetTypeCall=true&directAccess=false");
				
			/*URL url = new URL("http://unidocs.weport.co.kr/ezpdf/index.jsp?encdata=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI"
					+ "1NiJ9.eyJlbmRwb2ludF91cmwiOiJodHRwOi8vd3d3LndlcG9ydC5jby5rci9kb2N1bWVudC91c2VyLWNvbnRlbnRzLz"
					+ "Q0NzYzNTMvcmVhZGVyIiwidXNlcl9jb250ZW50X2lkIjo0NDc2MzUzLCJleHBpcmVkX2F0IjoiMjAxOS0wNi0xMlQwNjo"
					+ "1NjoyOC41MTcyNjkrMDA6MDAiLCJhbGxvd19kb3dubG9hZCI6ZmFsc2UsInByaW50X3VybCI6Imh0dHA6Ly93d3cud2Vwb"
					+ "3J0LmNvLmtyL2RvY3VtZW50L3VzZXItY29udGVudHMvNDQ3NjM1My9yZWFkZXIvcHJpbnQiLCJkb2N1bWVudF91cmwiOiJod"
					+ "HRwczovL3MzLmFwLW5vcnRoZWFzdC0yLmFtYXpvbmF3cy5jb20vcGRmLnN0b3JhZ2Uud2Vwb3J0LmNvLmtyLzIwMTkwMjI3L2"
					+ "xqYnA4cHZiMTVhaTJpN24zYnlvM2dpcWN1MmV6emJ0bjcxY2xnYW1zdGZzMHEzc21hYnQzcGUwaTYwOD9YLUFtei1FeHBpcmV"
					+ "zPTYwJlgtQW16LUNyZWRlbnRpYWw9QUtJQUlGU0lYRUlXMzVONkFMUVElMkYyMDE5MDYxMiUyRmFwLW5vcnRoZWFzdC0yJTJGc"
					+ "zMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDE5MDYxMlQwNjU2MjVaJlgtQW16LUFsZ29yaXRobT1BV1M0LUhNQUMtU0hBM"
					+ "jU2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZYLUFtei1TaWduYXR1cmU9ZTZkNzE2MDk3NzI5NzdiYjRhZWNiZTA0Y2JjNDIwNzF"
					+ "mMmY5ZDI2MGYxMDRlMGJjODg1MjYwNTBiMmRkYWYwNiJ9.2pX6O3AiOE2qW8sBZsqtaurZETRc6xEnn27U7X_R3z8");
			*/
			
		in = url.openStream();
		ir = new InputStreamReader(in,"UTF-8");
		br = new BufferedReader(ir);
		//fw = new FileWriter("c:\\down\\naver.html");
		//bw = new BufferedWriter(fw);
		pw = new PrintWriter("c:\\down\\naver.html","UTF-8");
		
		
		String readLine = null;
		while((readLine = br.readLine())!= null){
		
			System.out.println(readLine);
			pw.println(readLine);
		
		}
		
		}catch(MalformedURLException e){
		
			e.printStackTrace();
		}catch(IOException e){
				e.printStackTrace();
			
		} finally {
			try {
				if (in != null) in.close();
				if (ir != null) ir.close();
				if (br != null) br.close();
				if (fw != null) fw.close();
				if (bw != null) bw.close();
				if (pw != null) pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();

			}
		
		
	}
}
}

