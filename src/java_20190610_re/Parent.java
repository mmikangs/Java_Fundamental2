package java_20190610_re;

public abstract class Parent {

	String name;
	String cphone;
	
	
	//���� ����� �ٸ��� �θ�� ����� �־�? ����!!! ������ �ִ� ����� ����. �θ��� ���� ����� �ڽĸ��� ���� �޶�.
	//�׷��� ������ ����� overriding �ϴ� ���̾�. 
	//�ƹ� ����� ���� ������ public �� abstract���� �ٲٴ� ���̾�!!
	
	
//public void insert(){}
	
//����� ���� �޼��� (abstract�� ���δ�.)
	public abstract void insert();
	
	public abstract void delete(int i);
}
