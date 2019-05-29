package java_20190529;

public class WhileDemo {
	public static void main(String[] args) {
		
		int sum1 = 0;
		int i = 0;
		while(i <= 100) {
				sum1 += i;
				i++;
		}
		System.out.println("1~100까지의 합 :" + sum1);
		/*
		 * for (int j=2; j<=9; j++){
			//for (int k=1;k<=9;k++)
				//System.out.println(j+"*"+k+"="+(j*k));
		}
	}*/
		
	int j=2;
	while(j<=9){
		int k=1;
			while(k<=9){
			System.out.println(j+"*"+k+"="+(j*k));
			k++;
	}//end inner while
			j++;		
	}//end outter while
	
	}
	
}
