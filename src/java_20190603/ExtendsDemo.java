package java_20190603;

public class ExtendsDemo {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.name = "���ϴ�";
		c.cphone = "010-2323-5656";
		System.out.print("�̸� : " +c.name);
		System.out.println("/ �ڵ��� : " +c.cphone);
		c.actionCustomer();
		

		Alba a = new Alba();
		a.name ="�˹ٸ�";
		a.cphone = "010-5757-9575";
		a.address = "����Ư����";
		System.out.print("�̸� : " +a.name);
		System.out.print("/ �ڵ��� : " +a.cphone);
		System.out.println("/ �ּ� : " +a.address);
		a.actionAlba();
		a.actionCustomer();
		
		
		
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone = "010-1234-5678";
		m.address = "��⵵";
		m.id = "rocknroll";
		m.password = "123123";
		System.out.printf("�̸� : " +m.name);
		System.out.printf("/ �ڵ��� : " +m.cphone);
		System.out.printf("/ �ּ� : " +m.address);
		System.out.printf("/ ���̵� : " +m.id);
		System.out.println("/ ��й�ȣ : " +m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		
		//Super Ÿ��(Alba)���� Sub ��ü(Manager)�� ������ �� �ִ�. 
		//��������� Super Ÿ��(Alba)�� ������ ���� Ŭ����(Customer) ���� ����.
		Alba alba = (Alba) new Manager();
		alba.name = "�Ŵ���";
		alba.cphone = "010-5454-7877";
		alba.address = "���";
		//alba.id = "rocknroll";
		//alba.password = "123123";
		System.out.printf("�̸� : " +m.name);
		System.out.printf("/ �ڵ��� : " +m.cphone);
		System.out.printf("/ �ּ� : " +m.address);
	
		alba.actionAlba();
		alba.actionCustomer();
	
		
		
		
		
		
	}
}
