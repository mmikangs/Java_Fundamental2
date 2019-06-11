package java_20190610;

public class ThreadDemo extends Thread {

	public ThreadDemo(String msg) {
		//Thread 클래스의 매개변수가 문자열인 생성자를 호출
		//msg는 스레드 이름을 정한다. 
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
		ThreadDemo t1 = new ThreadDemo("첫번째 스레드");
		t1.start();
		// t1.run2();
		ThreadDemo t2 = new ThreadDemo("두번째 스레드");
		t2.start();
		// t2.run2();
		System.out.println("****************end********************");
	}
}
