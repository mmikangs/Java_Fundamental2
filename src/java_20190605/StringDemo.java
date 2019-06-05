package java_20190605;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");

		String str3 = "java";
		String str4 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

		String ssn = "930606-1489575";

		// ���ڿ� �߿��� Ư�� index���ִ� ���ڸ� ��ȯ�Ѵ�.
		char c = ssn.charAt(6);
		System.out.println(c);
		// concat(String msg)���� �޼���� ���ڿ� ����

		String temp = ssn.concat("�ȳ��ϼ���");
		System.out.println(temp);

		
		// �� ������ � �������� �˾� �� �� ���� ���� endsWith
		//endswith(String temp)�޼���� temp ���ڿ��� ������ true, �׷��� ������ false�Դϴ�.
		//startswith�� �̷��� �ּҷ� ������ �� �̷� ui�� �����϶�� �� �� ���� ����Ѵ�.
		
		String fileName = "test.doc";
		
		if(fileName.endsWith("zip")){
			System.out.println("�������� �Դϴ�.");
		}
		else if(fileName.endsWith("doc")){
			System.out.println("Office ���� �Դϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
			
		}
		
		//startsWith(String temp) �޼���� temp ���ڿ��� �����ϸ� true, �׷��� ������ 
		String url = " http://www.naver.com/sports";
		String uri = "/";
		if(uri.startsWith("sports")){
				System.out.println("������ �޴� �Դϴ�.");
			
		}
		else if(uri.startsWith("news")){
				System.out.println("���� �޴��Դϴ�.");
			
		}
		else {
			System.out.println("404 �������Դϴ�.");
			
		}

		//ȸ������ �� ������ �Է��� ���� ������� �빮�ڷθ� �Է¹ް� ���� ��, ��ҹ��� ���� ���� �Է¹ް� ���� �� 
		
		String s1 = "Java";
		String s2 = "JAVA";
	
		System.out.println("�Ϲ������δ� ��ҹ��� ������ �����ϴ�." + s1.equals(s2));
		System.out.println("equalsIgnoreCase�� ����ϸ� ��ҹ��� ���о��� ���Ѵ�." +s1.equalsIgnoreCase(s2));
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		
		System.out.println(ssn.indexOf("-"));
		System.out.println(ssn.lastIndexOf("-"));
		
		ssn = ssn.replaceAll("-", "*");
		System.out.println(ssn);
		
		
		String html = "�ȳ��ϼ���\n ���� �������Դϴ�. \n ������ �� ��Ź�帳�ϴ�.";
		html = html.replaceAll ("\n", "<br>");
		
		System.out.println(html);
		
		//substring�� ������ ������ �����ض��� �����ִ� ��. 
		String ssn1 = ssn.substring(0,ssn.indexOf("*"));
		String ssn2 = ssn.substring(ssn.indexOf("*")+1);
		
	//Ư�� ���ڿ��� ������� �յڸ� �߶󳻴� ��. 
		System.out.println(ssn1);
		System.out.println(ssn);
		
		fileName = "abc.def.ghi.zip";
		String fileName1 = fileName.substring(0, ssn.indexOf("*"));
		String fileName2 = fileName.substring(ssn.indexOf("*")+1);
		
		System.out.println(fileName1);
		System.out.println(fileName2);
		
		
		fileName1 = "hello";
		fileName2 = "hello ";
		
		System.out.println(fileName1.length());
		System.out.println(fileName2.length());
		
			if(fileName1.equals(fileName2)){
				
				System.out.println("����");
			}
			else 
				System.out.println("����");
			
			int a = 10;
			
			//���Ʒ� ���� �ǹ̾�. �Ѵ� ���ڿ��� ������ִ� ���̾�
			
			String t1 = String.valueOf(a);
			String t2 = a+"";

			System.out.println(a);
		
			
			ssn  = "234567-8923456";
			//string�� �����Ͱ� ����ȭ �Ǿ� ���� �� ���� ����. 
			//Regular expression 
			String[] t3 = ssn.split("-");
			System.out.println(t3[0]);
			System.out.println(t3[1]);
			
			
			//��� �ϸ� , ���̴��� �н��ϴ� ��. 
			//format�� �� ���ڿ��� ��ȯ���ִ� ���̴�. 
			
			String t4 = String.format("%,.2f and %,.2f", 10000.238,200000000.58);
			System.out.println(t4);
			
			
			//[$�� ���� ����]
			//���� �Է��� ���� ��� ������ �ٲٰ� ���� ��, $��ȣ�� ����ؼ� ���ϴ� ������� ����� �� �ִ�. 
			String str = String.format("%3$f, %2$f, %1$f", 111.11,222.22,333.33);
			System.out.println(str);
			
			//[���� ���̿� ,�� �ְ� ���� ���]
			String str55 = String.format("%,f, %,f, %,f", 111111.56,224552.54,333345.23);
			System.out.println(str55);
		
			//[���� ���̿� ������ �ְ� ���� ���]
			String str33 = String.format("%,f, %2f, %50f", 646464.454,34343.54,272745.23);
			System.out.println(str33);
		
			//[���� ���̿� ������ �ְ� ���� ���]
			String str66 = String.format("%1%s,20.2f, %2f, %50f",5454.21214,34343.54,272745.23);
			System.out.println(str66);
			
	
	
		/*	
			double lemon = 14;
			
			System.out.println(lemon);
			
			*/

			int m = 10;
			int n = 20;
			
			//�鿩���� �ϰ� ���� �� %n�� ����ϸ� �ȴ�.
			//%n�� ������ ��!!
			System.out.printf("m�� ���� %d �̰��, %nn�� ���� %d�Դϴ�.", m,n);
			
			
			
	}
	

	
		
		/*
		 * 
		 * String sq1 = "select emp, no, djfkaldfjkaldfjadlkf";
		 * 
		 * //�̷��� �ϸ� ���� ��� ���� ���ǵǴϱ� pool�� �� ���ǰ� �Ǿ��־�. sq1 += "from amperwer"; sq1
		 * += "fjdkladkfja"; sq1 += "dfadadfadf";
		 * 
		 * 
		 * //���ڿ� ��� �����ִ°� string buffer ��� ���� �ٷ� �־�. ���̰� ����� ������ ������ ��ü�� �����Ѱž�.
		 */

}
