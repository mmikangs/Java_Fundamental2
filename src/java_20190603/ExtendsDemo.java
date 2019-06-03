package java_20190603;

public class ExtendsDemo {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.name = "김하늘";
		c.cphone = "010-2323-5656";
		System.out.print("이름 : " +c.name);
		System.out.println("/ 핸드폰 : " +c.cphone);
		c.actionCustomer();
		

		Alba a = new Alba();
		a.name ="알바몬";
		a.cphone = "010-5757-9575";
		a.address = "서울특별시";
		System.out.print("이름 : " +a.name);
		System.out.print("/ 핸드폰 : " +a.cphone);
		System.out.println("/ 주소 : " +a.address);
		a.actionAlba();
		a.actionCustomer();
		
		
		
		Manager m = new Manager();
		m.name = "매니저";
		m.cphone = "010-1234-5678";
		m.address = "경기도";
		m.id = "rocknroll";
		m.password = "123123";
		System.out.printf("이름 : " +m.name);
		System.out.printf("/ 핸드폰 : " +m.cphone);
		System.out.printf("/ 주소 : " +m.address);
		System.out.printf("/ 아이디 : " +m.id);
		System.out.println("/ 비밀번호 : " +m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		
		//Super 타입(Alba)으로 Sub 객체(Manager)를 생성할 수 있다. 
		//멤버변수는 Super 타입(Alba)의 포함한 상위 클래스(Customer) 접근 가능.
		Alba alba = (Alba) new Manager();
		alba.name = "매니저";
		alba.cphone = "010-5454-7877";
		alba.address = "울산";
		//alba.id = "rocknroll";
		//alba.password = "123123";
		System.out.printf("이름 : " +m.name);
		System.out.printf("/ 핸드폰 : " +m.cphone);
		System.out.printf("/ 주소 : " +m.address);
	
		alba.actionAlba();
		alba.actionCustomer();
	
		
		
		
		
		
	}
}
