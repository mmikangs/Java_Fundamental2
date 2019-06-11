package java_20190611;

public class RunnableDemo implements Runnable{

	// run하고 ctrl+space하면

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + i);
		}
	}
	

	public static void main(String[] args) {
		System.out.println("***********start************");
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1, "첫번째 쓰레드");
		System.out.println("첫번째 스레드 우선순위 : "+t1.getPriority());
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2, "두번째 쓰레드");
		System.out.println("두번째 스레드 우선순위 : "+t2.getPriority());
		
	
		
		t1.start();
		t2.start();
		System.out.println("**********end***********");

	}

}
