package java_20190531;

public class Constructor {

	private String name;
	private String email;
	private int age;

	// 디폴트 생성자
	// 생성자는 클래스 이름과 같고, 반환값이 없는 형태를 가지고 있다.

	//디폴트 생성자 : 클래스 내에 생성자가 없는 경우 compiler 가 자동으로 생성해준다.
	//클래스 내에 생성자가 1개라도 있는 경우는 compiler가 생성해주지 않는다.
	// 한 클래스내에 생성자가 없으면 자동으로 compiler가 디폴ㅡ 생성자를 만들어 준다.
	// 한 클래스 내에 생성자가 하나라도 있으면 compiler가 생성자를 만들지 않음.
	public Constructor() {

	}


	// 초기화를 두개만 해줘.
	// 생성자의 overloading을 자유롭게 할 수 있다.

	public Constructor(String name, String email) {

		// 매개변수 3개짜리 호출.
		this(name, email, 0);
		// this.name = name;
		// this.email = email;
	}
	

	// 매개 변수 3개 인 생성자
	// 생성자도 매소드의 overloading처럼 생성자도 overloading이 가능함.

	public Constructor(String name, String email, int age) {

		// this는 로컬변수와 instance변수를 구분하기 위해 사용함.
		this.name = name;
		this.email = email;
		this.age = age;

	}

	public static void main(String[] args) {
		
		
		/*c= new Constructor();
		c.name = "성영한";
		c.email = "sodam23@gnamil.com";
		c.age = 10;
		*/
		
		Constructor c = new Constructor("박수현", "sooseo3@naver.com", 26);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);

		c = new Constructor ("유제희","jimoon@bluesky.co.kr",31);
		
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);

		
	}

}
