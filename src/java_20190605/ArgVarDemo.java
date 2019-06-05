package java_20190605;

public class ArgVarDemo {

	
	public int plus (int... temp){
		int sum = 0;
		
		/*
		for (int i=0;i<temp.length;i++){
			sum+= temp[i];
			
		}*/
		
		
		// 다 끄집어 오는 것은 enhance for문이 좋다.
		for (int value : temp){
			sum += value;
		}
		
		return sum;
		
		
	}
	
	public static void main(String[] args){
		ArgVarDemo d = new ArgVarDemo();
		
		//only int만 가능하다.
		int a = d.plus(1);
	System.out.println(a);
	
	int b = d.plus(1,2);
	System.out.println(b);
	
	int c = d.plus(10,20,30);
	System.out.println(c);
	
	}
}
