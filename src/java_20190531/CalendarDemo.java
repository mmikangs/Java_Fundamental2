package java_20190531;

//ctrl+shift+O
//ctrl+shift+O (IOExcpetion ������ ���°ž�!!!)

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
			System.out.println("��¥�� �Է��ϼ���.");
			String readLine = console();

			if (readLine.equals("bye"))
				break;

			c = new Calendar();
			// split("") ���鹮�ڷ� ���ڿ��� �и��ؼ� �迭�� ��ȯ
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
			//4���̻��� ���� �Ѱ��� �Է����� ���� ���!!
			else {
			}*/

		}
		// System.out.println("���� ���� ���ڿ� : " +readLine);
	}

}
