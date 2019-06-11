package java_20190611;

public class RunnableDemo implements Runnable{

	// run�ϰ� ctrl+space�ϸ�

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
		Thread t1 = new Thread(r1, "ù��° ������");
		System.out.println("ù��° ������ �켱���� : "+t1.getPriority());
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2, "�ι�° ������");
		System.out.println("�ι�° ������ �켱���� : "+t2.getPriority());
		
	
		
		t1.start();
		t2.start();
		System.out.println("**********end***********");

	}

}
