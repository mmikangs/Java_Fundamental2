package java_20190528;

public class CharDemo {

	public static void main(String[] args) {

		// 문자 표현법
		char a = 'q';

		// 유니코드 표현법 '\u0000'

		char b = '\uAE40';
		char c = '\uBBF8';
		char d = '\uACBD';

		System.out.print(b);
		System.out.print(c);
		System.out.print(d);

		// 아스키코드 표현법
		char e = 97;
		System.out.print(e);

		// 이스케이프 케릭터(Escape character)
		System.out.println("룰루랄라\t만세");
		System.out.println("랄랄라라\n만세");
		System.out.println("랄랄라라\b만세");

		// 문자열 내용
		// 문자열에서는 백슬레시가 인식이 안되는 경우가 있음. 그래서 두번 써야함. (경로를 출력하고 싶을 때, 백슬레시 두번 있어야
		// 할 때 사용함.
		System.out.println("C:\\dev\\eclipse");

		// 문자열 중에서 인식 못하는 것은 쌍따옴표(""), 백슬래시(\) 2가지만 인식을 못함.
		// 쌍따옴표 붙일 때에도 백슬래시(\)를 해주면 인식이 가능하게 된다.

		System.out.println("김미경 \"천재\" ");
		System.out.println("김미경 '천재' ");

		// 문자에서 백슬레시(\) 인식이 안됨.

		// \,' 두개의 문자는 char 에서 인식을 못하기 때문에 두 문자 앞에 \을 붙여준다.
		char f = '\\';
		char g = '\'';
		//역슬래시 굳이 안써도 되나 써도 문제가 없음. 
		char h = '"';

		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
