package java_20190611_re;

public class Tv {

	String color;
	boolean power;
	int channel;
	
	
	void power() {
		power =! power;
		
	}
	void channelUp(){
		
		channel++;
		
	}
	void channelDown(){
		
		channel--;
		
	}	
}

class TVtest1{

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		System.out.println("t1�� Channel���� " +t1.channel+ "�Դϴ�.");
		System.out.println("t1�� Channel���� " +t2.channel+ "�Դϴ�.");

		t1.channel = 7;
		System.out.println("t1�� channel ���� 7�� �����߽��ϴ�.");
		
		System.out.println("t1�� channel ���� " +t1.channel + "�Դϴ�.");
		System.out.println("t1�� channel ���� " +t2.channel + "�Դϴ�.");
		
	}
}
