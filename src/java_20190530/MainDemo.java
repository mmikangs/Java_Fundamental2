package java_20190530;

public class MainDemo {

	public static void main(String[] args) {

		// customer object만든것

		// 1. Customer c에서 Customer 는 Customer Reference Type이고, c는 reference
		// 이다.
		// 2. new Customer()는 Customer Object

	/*	Customer c = new Customer();

		c.name = "김미경";
		c.cphone = "010-1234-5678";
		// class이름을 full로 작성해서 쓰는 경우가 있어. 전역변수니 class name으로 하는 경우가 있어.
		// c.interestRate = 4.3;
		Customer.interestRate = 4.3;
		// Customer.BANKNAME = "국민은행"; <- ERROR가 뜬다. FIANL변수로 설정했기 때문에 다른 값을 입력할
		// 수가 없음. 고정변수이기에 변경할 수 없다.

		c.register();

		// new하면 새로운 것을 그린다는 의미로 생각해봐......
		// static은 한번만 정해놓으면 값이 계속나와. static interestRate를 따로 적지않아도 된다.

		Customer c2 = new Customer();
		c2.name = "Katie Kim";
		c2.cphone = "010-9876-5423";
		c.interestRate = 4.5;

		c2.register();
		c.register();

		// c3 reference 를 c2 reference 가 가리키는 Object를 참조하라는 의미.
		Customer c3 = c2;

		c3.name = "손정의";
		c3.cphone = "010-1111-2222";

		c3.register();
		c2.register();*/

		
		Member m = new Member();
		m.setName("heesoo");
		m.setCphone("010-3870-2013");
		m.setAddress("seoul");
		m.setZipcode("47890");	
		
		System.out.println(m.getName());
		System.out.println(m.getCphone());
		System.out.println(m.getAddress());
		System.out.println(m.getZipcode());
		
		
		Member m2 = new Member();
		m2.setName("zoohyuni");
		m2.setCphone("010-5355-3045");
		m2.setAddress("Busan");
		m2.setZipcode("45960");
		
		
		System.out.println(m2.getName());
		System.out.println(m2.getCphone());
		System.out.println(m2.getAddress());
		System.out.println(m2.getZipcode());
		
	}
}
