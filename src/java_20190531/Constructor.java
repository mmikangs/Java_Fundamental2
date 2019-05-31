package java_20190531;

public class Constructor {

	private String name;
	private String email;
	private int age;

	// ����Ʈ ������
	// �����ڴ� Ŭ���� �̸��� ����, ��ȯ���� ���� ���¸� ������ �ִ�.

	//����Ʈ ������ : Ŭ���� ���� �����ڰ� ���� ��� compiler �� �ڵ����� �������ش�.
	//Ŭ���� ���� �����ڰ� 1���� �ִ� ���� compiler�� ���������� �ʴ´�.
	// �� Ŭ�������� �����ڰ� ������ �ڵ����� compiler�� ������ �����ڸ� ����� �ش�.
	// �� Ŭ���� ���� �����ڰ� �ϳ��� ������ compiler�� �����ڸ� ������ ����.
	public Constructor() {

	}


	// �ʱ�ȭ�� �ΰ��� ����.
	// �������� overloading�� �����Ӱ� �� �� �ִ�.

	public Constructor(String name, String email) {

		// �Ű����� 3��¥�� ȣ��.
		this(name, email, 0);
		// this.name = name;
		// this.email = email;
	}
	

	// �Ű� ���� 3�� �� ������
	// �����ڵ� �żҵ��� overloadingó�� �����ڵ� overloading�� ������.

	public Constructor(String name, String email, int age) {

		// this�� ���ú����� instance������ �����ϱ� ���� �����.
		this.name = name;
		this.email = email;
		this.age = age;

	}

	public static void main(String[] args) {
		
		
		/*c= new Constructor();
		c.name = "������";
		c.email = "sodam23@gnamil.com";
		c.age = 10;
		*/
		
		Constructor c = new Constructor("�ڼ���", "sooseo3@naver.com", 26);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);

		c = new Constructor ("������","jimoon@bluesky.co.kr",31);
		
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);

		
	}

}
