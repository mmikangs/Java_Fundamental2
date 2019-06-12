package java_20190612;

//���̹� �˻� API ���� - ���� URL - GET
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIExamShortenURL {

	public String getShortenURL(String id, String secret, String u) {
	       StringBuffer response = new StringBuffer();
	     String clientId = id;//���ø����̼� Ŭ���̾�Ʈ ���̵�";
	     String clientSecret = secret;//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
	     try {
	         String text = u;
	        String apiURL = "https://openapi.naver.com/v1/util/shorturl?url=" + text;
	         URL url = new URL(apiURL);
	         HttpURLConnection con = (HttpURLConnection)url.openConnection();
	         con.setRequestMethod("GET");
	         con.setRequestProperty("X-Naver-Client-Id", clientId);
	         con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	         int responseCode = con.getResponseCode();
	         BufferedReader br;
	         if(responseCode==200) { // ���� ȣ��
	             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	         } else {  // ���� �߻�
	             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	         }
	         String inputLine;
	  
	         while ((inputLine = br.readLine()) != null) {
	             response.append(inputLine);
	         }
	         br.close();
	      //   System.out.println(response.toString());
	     } catch (Exception e) {
	         System.out.println(e);
	     }
	     return response.toString();
	}
	
	
	
 public static void main(String[] args) {
     String clientId = "6t_DDsxsSCVg6L4DKwg0";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
     String clientSecret = "jVs7Prklqs";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
     
     
     APIExamShortenURL a = new APIExamShortenURL();
     String surl = a.getShortenURL(clientId, clientSecret, "https://naver.com");
     
     System.out.println(surl);
     
       
     
    /* try {
         String text = "http://unidocs.weport.co.kr/ezpdf/index.jsp?encdata=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbmRwb2ludF91cmwiOiJodHRwOi8vd3d3LndlcG9ydC5jby5rci9kb2N1bWVudC91c2VyLWNvbnRlbnRzLzQ0NzYzNTMvcmVhZGVyIiwidXNlcl9jb250ZW50X2lkIjo0NDc2MzUzLCJleHBpcmVkX2F0IjoiMjAxOS0wNi0xMlQwNjo1NjoyOC41MTcyNjkrMDA6MDAiLCJhbGxvd19kb3dubG9hZCI6ZmFsc2UsInByaW50X3VybCI6Imh0dHA6Ly93d3cud2Vwb3J0LmNvLmtyL2RvY3VtZW50L3VzZXItY29udGVudHMvNDQ3NjM1My9yZWFkZXIvcHJpbnQiLCJkb2N1bWVudF91cmwiOiJodHRwczovL3MzLmFwLW5vcnRoZWFzdC0yLmFtYXpvbmF3cy5jb20vcGRmLnN0b3JhZ2Uud2Vwb3J0LmNvLmtyLzIwMTkwMjI3L2xqYnA4cHZiMTVhaTJpN24zYnlvM2dpcWN1MmV6emJ0bjcxY2xnYW1zdGZzMHEzc21hYnQzcGUwaTYwOD9YLUFtei1FeHBpcmVzPTYwJlgtQW16LUNyZWRlbnRpYWw9QUtJQUlGU0lYRUlXMzVONkFMUVElMkYyMDE5MDYxMiUyRmFwLW5vcnRoZWFzdC0yJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDE5MDYxMlQwNjU2MjVaJlgtQW16LUFsZ29yaXRobT1BV1M0LUhNQUMtU0hBMjU2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZYLUFtei1TaWduYXR1cmU9ZTZkNzE2MDk3NzI5NzdiYjRhZWNiZTA0Y2JjNDIwNzFmMmY5ZDI2MGYxMDRlMGJjODg1MjYwNTBiMmRkYWYwNiJ9.2pX6O3AiOE2qW8sBZsqtaurZETRc6xEnn27U7X_R3z8";
         String apiURL = "https://openapi.naver.com/v1/util/shorturl?url=" + text;
         URL url = new URL(apiURL);
         HttpURLConnection con = (HttpURLConnection)url.openConnection();
         con.setRequestMethod("GET");
         con.setRequestProperty("X-Naver-Client-Id", clientId);
         con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
         int responseCode = con.getResponseCode();
         BufferedReader br;
         if(responseCode==200) { // ���� ȣ��
             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
         } else {  // ���� �߻�
             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
         }
         String inputLine;
         StringBuffer response = new StringBuffer();
         while ((inputLine = br.readLine()) != null) {
             response.append(inputLine);
         }
         br.close();
         System.out.println(response.toString());
     } catch (Exception e) {
         System.out.println(e);
     }*/
 }
}