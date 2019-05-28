package java_20190528;

public class ForDemo {

	public static void main(String[] args) {

		
		 /* int sum = 0;
		 * 
		 * for (int i = 0; i <= 10; i++) { sum = sum + i; }
		 * 
		 * System.out.println("1부터 10까지 합은ㅇ : " + sum);
		 * 
		 * // 1부터 100중에서 짝수만 더한 값 구하기
		 * 
		 * int sum1 = 0; int i;
		 * 
		 * for (i = 1; i <= 100; i++) {
		 * 
		 * if (i % 2 == 0) { sum1 = sum1 + i; }
		 * 
		 * } System.out.println("1부터 " + (i - 1) + "까지 합은ㅇ : " + sum1);
		 * 
		 * // 구구단
		 */
		
		// tt라고 레이블을 정해서 반복 루프를 나가는 방법이 있다. 
		
		  tt : for (int j=2; j <= 9; j++) { 
			  if(j==3) continue;
			  	for (int k = 1; k <= 9; k++) {
			  		if(k==4) break tt;
			 
		  System.out.println(j + "*" + k + "=" + (j * k));
			 
			  	}
		  }
		  
	}
}


		// 소수 구하는 방법 (시도해봄)

		/*
		 * int sum2 = 0; int m; int n;
		 * 
		 * for (m=2; m<=100; m++) { for(n=2 ; n<m; n++){
		 * 
		 * if(m%n!=0)
		 {
		 sum2 += m;
		 }
		  
		 * } }
		 * 
		 * }
		 * 
		 * System.out.println("값은" + sum2);
		 * 
		 * }
		 */
		
	/*	
		// 소수의 개수를 구하는 반법

		int primeCount = 0;
		for (int a = 1; a <= 100; a++) {
			int count = 0;
			for (int k = 1; k <= a; k++) {
				if (a % k == 0) {
					count += 1;
				}
			}

			if (count == 2) {
				System.out.println(a + "는 소수입니다.");
				primeCount += 1;
			}
		}
		System.out.println("소수의 갯수는 : " + primeCount);
	}
}*/
