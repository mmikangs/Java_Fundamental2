package java_20190531;

//Ctrl+shift+O (�ٸ�package���� ������ �� ��� class�� �ν��� �� ����!!!!)
import java_20190531.tt.Cat;

//����ߴٰ� �ؼ� �θ�Բ� �� �� �� �ִ°� �ƴ�!!!
//private�� ����ص� ���� �ȵ�!!!!!!!!!!!
//protect�� ��ӹ����� ������~
//���������ڷ� �����ϸ� �ȵǴ� �͵� �ִµ� protect�� ��ӹ����� �� �� �־�.

public class AccessModifierDemo extends Cat {

	public static void main(String[] args) {
		Car c = new Car();

		// modelNumber�� ��� private�� �߱� ������ class�������� ���ǰ� �����ϴ�. (setters��
		// getters�� �̿��ϰų� public���� �ٲٰų�!!!!!!!!)
		// c.modelNumber = "68�� 4395";
		// �ּ��� �ڵ� �����ٰ� �ۼ��Ѵ�. �ؿ� �޸� �ȵ�!!!!!�ּ��� �а� �ؿ� �ڵ带 ���� �ȴ�.!!!!!!!

		// default�� ���� ��Ű��(���丮)���� ���� ����.
		c.color = "red";

		// ���� �ٸ� ��Ű���� �־�߸� �ǹ̰� �־�.
		// protected�� ���Ǵ� ���� �ٸ� ��Ű������ ��ӹ޴� ��� ���ٰ���.
		c.doorCount = 5;

		// ���� �ٸ� ��Ű������ ���� ����
		// underscore�� ���̸� ������ ������ ������.�� �� �� �ֵ���
		c.price = 10_000_000;

		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);

		// package�ȿ� �մ� ���� class�� �ν��ϴµ� package�ȿ� �ִ� �ٸ� package�� �ν����� ����
		Cat cat = new Cat();

		cat.nickName = "tomcat";


		AccessModifierDemo a = new AccessModifierDemo();

		// Cat class�� ��ӹ�����, public�Ӹ� �ƴ϶� protected�� ��� ����. (even though, packages are different. ���� �ٸ� package��� ������)
		// protected�� ����� �����ϴ�.
		a.age = 10;
		a.nickName = "����";

	}

}
