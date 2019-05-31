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

			if (readLine.equals("bye")) break;
			
			
			//readLine -> 2019 05 31
			// split("") ���鹮�ڷ� ���ڿ��� �и��ؼ� �迭�� ��ȯ
			//data[0] = "2019", data[1] = "5", data[2] = "31"
			String[] data = readLine.split(" ");
			
			//Calendar ��ü�� �����ؼ� �Ʒ��� ��� ��� ����� �� �ִ�.
			c = new Calendar();
			
			
			if (data.length == 1) {
				//year = 2019;
				//Integer.parseInt("2019") ->2019
				//Integer.parseInt() �޼ҵ�� ���ڿ��� int�� ��ȯ�ϴ� �޼���.
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
