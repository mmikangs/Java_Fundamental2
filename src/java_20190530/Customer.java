package java_20190530;

public class Customer {

	// instance variable
	String name;
	String cphone;

	// static variable
	static double interestRate;
	final static String BANKNAME = "��������";

	public void register() {

		// DB insert
		System.out.println("���� ��ϵǾ����ϴ�");
		System.out.println("�̸� : " + name + ", �ڵ�����ȣ : " + cphone + " , ������ : " + interestRate + ", ����� : " + BANKNAME);

	}
}
