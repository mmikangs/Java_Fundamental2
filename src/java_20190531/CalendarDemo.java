package java_20190531;

//ctrl+shift+O
//ctrl+shift+O (IOExcpetion 때문에 쓰는거야!!!)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {

	public static String console() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {

		Calendar c = null;

		while (true) {
			System.out.println("날짜를 입력하세요.");
			String readLine = console();

			if (readLine.equals("bye"))
				break;

			c = new Calendar();
			// split("") 공백문자로 문자열을 분리해서 배열로 전환
			String[] data = readLine.split(" ");
			if (data.length == 1) {
				int year = Integer.parseInt(data[0]);
				c.print(year);
				
			}
			else if (data.length == 2) {
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				c.print(year,month);
				
			} 
			else if (data.length == 3) {
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int day = Integer.parseInt(data[2]);
				c.print(year,month,day);
			}
			
				/*			
			//4개이상인 경우와 한개도 입력하지 않은 경우!!
			else {
			}*/

		}
		// System.out.println("한줄 읽은 문자열 : " +readLine);
	}

}
