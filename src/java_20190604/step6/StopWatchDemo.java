package java_20190604.step6;

public class StopWatchDemo {
	public static void execute(StopWatch sm){
		sm.start();
		
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sm.stop();
		System.out.println("����ð� : "+sm.getElapsedTime());
	}
	
	
	
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		execute(sm);
		
		StopNanoWatch sn = new StopNanoWatch();
		execute(sn);
		
		
		
	}
}



