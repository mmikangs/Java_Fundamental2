package java_20190610;

public class ThreadDemo extends Thread {

	public ThreadDemo(String msg) {
		//Thread Ŭ������ �Ű������� ���ڿ��� �����ڸ� ȣ��
		//msg�� ������ �̸��� ���Ѵ�. 
		super(msg); 

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + i);

		}
	}

	/*
	 * public void run() { //public void run2() {
	 * 
	 * for (int i = 0; i < 1000; i++) { String threadName =
	 * Thread.currentThread().getName(); System.out.println(threadName +" : "
	 * +i); } }
	 */
	public static void main(String[] args) {

		System.out.println("****************start******************");
		ThreadDemo t1 = new ThreadDemo("ù��° ������");
		t1.start();
		// t1.run2();
		ThreadDemo t2 = new ThreadDemo("�ι�° ������");
		t2.start();
		// t2.run2();
		System.out.println("****************end********************");
	}
}
