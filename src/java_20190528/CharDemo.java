package java_20190528;

public class CharDemo {

	public static void main(String[] args) {

		// ���� ǥ����
		char a = 'q';

		// �����ڵ� ǥ���� '\u0000'

		char b = '\uAE40';
		char c = '\uBBF8';
		char d = '\uACBD';

		System.out.print(b);
		System.out.print(c);
		System.out.print(d);

		// �ƽ�Ű�ڵ� ǥ����
		char e = 97;
		System.out.print(e);

		// �̽������� �ɸ���(Escape character)
		System.out.println("������\t����");
		System.out.println("�������\n����");
		System.out.println("�������\b����");

		// ���ڿ� ����
		// ���ڿ������� �齽���ð� �ν��� �ȵǴ� ��찡 ����. �׷��� �ι� �����. (��θ� ����ϰ� ���� ��, �齽���� �ι� �־��
		// �� �� �����.
		System.out.println("C:\\dev\\eclipse");

		// ���ڿ� �߿��� �ν� ���ϴ� ���� �ֵ���ǥ(""), �齽����(\) 2������ �ν��� ����.
		// �ֵ���ǥ ���� ������ �齽����(\)�� ���ָ� �ν��� �����ϰ� �ȴ�.

		System.out.println("��̰� \"õ��\" ");
		System.out.println("��̰� 'õ��' ");

		// ���ڿ��� �齽����(\) �ν��� �ȵ�.

		// \,' �ΰ��� ���ڴ� char ���� �ν��� ���ϱ� ������ �� ���� �տ� \�� �ٿ��ش�.
		char f = '\\';
		char g = '\'';
		//�������� ���� �Ƚᵵ �ǳ� �ᵵ ������ ����. 
		char h = '"';

		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
