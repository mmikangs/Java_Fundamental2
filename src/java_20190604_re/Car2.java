package java_20190604_re;



public class Car2 {
	String modelNumber;
	String color;
	int year;
	//������
	//�޼ҵ� ���� Ŭ���� �̸��� �����ϰ�, ��ȯ���� ���� ���
	//�ν��Ͻ� ���� �ʱ�ȭ �Ҷ� ����Ѵ�.
	public Car2(String modelNumber, String color, int year){
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args) {
		Car2 c1 = new Car2("010101000","white",2018);
		System.out.println("ù��° ��ü�� �������(�ν��Ͻ�����) ����ϱ�");
		System.out.println(c1.modelNumber + "\t"+c1.color+"\t"+c1.year);

		Car2 c2 = new Car2("010101001","black", 2019);
		System.out.println("�ι�° ��ü�� �������(�ν��Ͻ�����) ����ϱ�");
		System.out.println(c2.modelNumber + "\t"+c2.color+"\t"+c2.year);

		Car2 c3 = new Car2("010101002","red",2017);
		System.out.println("����° ��ü�� �������(�ν��Ͻ�����) ����ϱ�");
		System.out.println(c3.modelNumber + "\t"+c3.color+"\t"+c3.year);
	}

}


