package java_20190530;

public class MainDemo {

	public static void main(String[] args) {

		// customer object�����

		// 1. Customer c���� Customer �� Customer Reference Type�̰�, c�� reference
		// �̴�.
		// 2. new Customer()�� Customer Object

	/*	Customer c = new Customer();

		c.name = "��̰�";
		c.cphone = "010-1234-5678";
		// class�̸��� full�� �ۼ��ؼ� ���� ��찡 �־�. ���������� class name���� �ϴ� ��찡 �־�.
		// c.interestRate = 4.3;
		Customer.interestRate = 4.3;
		// Customer.BANKNAME = "��������"; <- ERROR�� ���. FIANL������ �����߱� ������ �ٸ� ���� �Է���
		// ���� ����. ���������̱⿡ ������ �� ����.

		c.register();

		// new�ϸ� ���ο� ���� �׸��ٴ� �ǹ̷� �����غ�......
		// static�� �ѹ��� ���س����� ���� ��ӳ���. static interestRate�� ���� �����ʾƵ� �ȴ�.

		Customer c2 = new Customer();
		c2.name = "Katie Kim";
		c2.cphone = "010-9876-5423";
		c.interestRate = 4.5;

		c2.register();
		c.register();

		// c3 reference �� c2 reference �� ����Ű�� Object�� �����϶�� �ǹ�.
		Customer c3 = c2;

		c3.name = "������";
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
