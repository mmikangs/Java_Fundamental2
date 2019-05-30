package java_20190530;

public class Customer {

	// instance variable
	String name;
	String cphone;

	// static variable
	static double interestRate;
	final static String BANKNAME = "국민으행";

	public void register() {

		// DB insert
		System.out.println("고객이 등록되었습니다");
		System.out.println("이름 : " + name + ", 핸드폰번호 : " + cphone + " , 이자율 : " + interestRate + ", 은행명 : " + BANKNAME);

	}
}
