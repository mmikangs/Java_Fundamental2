package java_20190528;

public class ForDemo {

	public static void main(String[] args) {

		
		 /* int sum = 0;
		 * 
		 * for (int i = 0; i <= 10; i++) { sum = sum + i; }
		 * 
		 * System.out.println("1���� 10���� ������ : " + sum);
		 * 
		 * // 1���� 100�߿��� ¦���� ���� �� ���ϱ�
		 * 
		 * int sum1 = 0; int i;
		 * 
		 * for (i = 1; i <= 100; i++) {
		 * 
		 * if (i % 2 == 0) { sum1 = sum1 + i; }
		 * 
		 * } System.out.println("1���� " + (i - 1) + "���� ������ : " + sum1);
		 * 
		 * // ������
		 */
		
		// tt��� ���̺��� ���ؼ� �ݺ� ������ ������ ����� �ִ�. 
		
		  tt : for (int j=2; j <= 9; j++) { 
			  if(j==3) continue;
			  	for (int k = 1; k <= 9; k++) {
			  		if(k==4) break tt;
			 
		  System.out.println(j + "*" + k + "=" + (j * k));
			 
			  	}
		  }
		  
	}
}


		// �Ҽ� ���ϴ� ��� (�õ��غ�)

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
		 * System.out.println("����" + sum2);
		 * 
		 * }
		 */
		
	/*	
		// �Ҽ��� ������ ���ϴ� �ݹ�

		int primeCount = 0;
		for (int a = 1; a <= 100; a++) {
			int count = 0;
			for (int k = 1; k <= a; k++) {
				if (a % k == 0) {
					count += 1;
				}
			}

			if (count == 2) {
				System.out.println(a + "�� �Ҽ��Դϴ�.");
				primeCount += 1;
			}
		}
		System.out.println("�Ҽ��� ������ : " + primeCount);
	}
}*/
