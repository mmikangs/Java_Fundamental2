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

		// 문자열 중에서 특정 index에있는 문자를 반환한다.
		char c = ssn.charAt(6);
		System.out.println(c);
		// concat(String msg)에서 메서드는 문자열 연결

		String temp = ssn.concat("안녕하세요");
		System.out.println(temp);

		
		// 이 파일이 어떤 파일인지 알아 낼 때 쓰는 것이 endsWith
		//endswith(String temp)메서드는 temp 문자열로 끝나면 true, 그렇지 않으면 false입니다.
		//startswith는 이러한 주소로 시작할 때 이런 ui를 생성하라고 할 때 많이 사용한다.
		
		String fileName = "test.doc";
		
		if(fileName.endsWith("zip")){
			System.out.println("압축파일 입니다.");
		}
		else if(fileName.endsWith("doc")){
			System.out.println("Office 문서 입니다.");
		}
		else {
			System.out.println("파일 입니다.");
			
		}
		
		//startsWith(String temp) 메서드는 temp 문자열로 시작하면 true, 그렇지 않으면 
		String url = " http://www.naver.com/sports";
		String uri = "/";
		if(uri.startsWith("sports")){
				System.out.println("스포츠 메뉴 입니다.");
			
		}
		else if(uri.startsWith("news")){
				System.out.println("뉴스 메뉴입니다.");
			
		}
		else {
			System.out.println("404 페이지입니다.");
			
		}

		//회원가입 시 사람들과 입력한 값과 관계없이 대문자로만 입력받고 싶을 때, 대소문자 구별 없이 입력받고 싶을 때 
		
		String s1 = "Java";
		String s2 = "JAVA";
	
		System.out.println("일반적으로는 대소문자 구분이 가능하다." + s1.equals(s2));
		System.out.println("equalsIgnoreCase를 사용하면 대소문자 구분없이 비교한다." +s1.equalsIgnoreCase(s2));
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		
		System.out.println(ssn.indexOf("-"));
		System.out.println(ssn.lastIndexOf("-"));
		
		ssn = ssn.replaceAll("-", "*");
		System.out.println(ssn);
		
		
		String html = "안녕하세요\n 저는 성영한입니다. \n 앞으로 잘 부탁드립니다.";
		html = html.replaceAll ("\n", "<br>");
		
		System.out.println(html);
		
		//substring은 어디부터 어디까지 추출해라라고 말해주는 것. 
		String ssn1 = ssn.substring(0,ssn.indexOf("*"));
		String ssn2 = ssn.substring(ssn.indexOf("*")+1);
		
	//특정 문자열을 기반으로 앞뒤를 잘라내는 것. 
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
				
				System.out.println("성공");
			}
			else 
				System.out.println("실패");
			
			int a = 10;
			
			//위아래 같은 의미야. 둘다 문자열로 만들어주는 것이야
			
			String t1 = String.valueOf(a);
			String t2 = a+"";

			System.out.println(a);
		
			
			ssn  = "234567-8923456";
			//string은 데이터가 정형화 되어 있을 때 쓰기 좋아. 
			//Regular expression 
			String[] t3 = ssn.split("-");
			System.out.println(t3[0]);
			System.out.println(t3[1]);
			
			
			//어떻게 하면 , 쓰이는지 학습하는 것. 
			//format은 이 문자열을 반환해주는 것이다. 
			
			String t4 = String.format("%,.2f and %,.2f", 10000.238,200000000.58);
			System.out.println(t4);
			
			
			//[$에 대한 설명]
			//숫자 입력한 값을 출력 순서를 바꾸고 싶을 떄, $기호를 사용해서 원하는 순서대로 출력할 수 있다. 
			String str = String.format("%3$f, %2$f, %1$f", 111.11,222.22,333.33);
			System.out.println(str);
			
			//[숫자 사이에 ,를 넣고 싶을 경우]
			String str55 = String.format("%,f, %,f, %,f", 111111.56,224552.54,333345.23);
			System.out.println(str55);
		
			//[숫자 사이에 간격을 넣고 싶을 경우]
			String str33 = String.format("%,f, %2f, %50f", 646464.454,34343.54,272745.23);
			System.out.println(str33);
		
			//[숫자 사이에 간격을 넣고 싶을 경우]
			String str66 = String.format("%1%s,20.2f, %2f, %50f",5454.21214,34343.54,272745.23);
			System.out.println(str66);
			
	
	
		/*	
			double lemon = 14;
			
			System.out.println(lemon);
			
			*/

			int m = 10;
			int n = 20;
			
			//들여쓰기 하고 싶을 땐 %n을 사용하면 된다.
			//%n은 개행이 됨!!
			System.out.printf("m의 값은 %d 이고요, %nn의 값은 %d입니다.", m,n);
			
			
			
	}
	

	
		
		/*
		 * 
		 * String sq1 = "select emp, no, djfkaldfjkaldfjadlkf";
		 * 
		 * //이렇게 하면 값이 계속 새로 정의되니까 pool에 다 정의가 되어있어. sq1 += "from amperwer"; sq1
		 * += "fjdkladkfja"; sq1 += "dfadadfadf";
		 * 
		 * 
		 * //문자열 계속 더해주는거 string buffer 라는 것이 다로 있어. 붙이고 지우고 가능한 가변의 개체가 가능한거야.
		 */

}
