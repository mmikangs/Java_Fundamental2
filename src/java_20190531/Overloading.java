package java_20190531;

//class�ȿ��� �޼ҵ� �̸��� ���Ƶ� ��� ����.

public class Overloading {

//�Լ� �̸��� �����鼭 ���� �ٸ��ݾ�.
	public void print(int i) {

		System.out.println(i);
	}

	public void print(String s) {
		System.out.println(s);
	}

	public void print(double d) {
		System.out.println(d);
	}
	
	//�߸��� �ڵ� (print�� �ؾ��ϴµ� printint ln �̷������� ��� �Ұž�? print�� print , �Ű������� ������.
	
	public void printInt (int i){
		System.out.println(i);
		
	}
	
	//overloading�ϴ� ���. ������ searchid �ڿ� �̷��� ���̴� �� �����ϰ� ������ ���⿡ ������. �׷��� �ִ��� overloading�ؼ� ���°� ����
	//overloading�� �Ű������� ������ ������ �ٸ��� �ؼ� �߰��ϴ� �������� ������ ��.
	
	public void search(String id){	
	}
	
	public void search(String f, String e){
		
	}
	
	public void search(String f, String m, String e){
	}
	
	public void search(String zipcode, int flag, String address){		
	}

}

	

