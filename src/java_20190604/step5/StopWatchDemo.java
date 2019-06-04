package java_20190604.step5;

public class StopWatchDemo {
	public static void execute(StopWatch sm){//추상 클래스의 폴리모피즘
		sm.start();
		
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sm.stop();
		System.out.println("경과시간 : "+sm.getElapsedTime());
	}
	
	
	
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		execute(sm);
		
		StopNanoWatch sn = new StopNanoWatch();
		execute(sn);
		
		/*StopMicroWatch smw = new StopMicroWatch();
		execute(smw);*/
		
	}
}



