package java_20190529;

public class ArrayDemo {

	public static void main(String[] args) {

		// int 배열 생성
		// new int[4] -> size를 의미
		int[] test = new int[4];
		int index = 0;
		// ++index로 하면 안돼. 러면 첫번째 방은 비어있게 되니까.
		// 코딩하다가 규칙이 생기면 규칙을 잘 활용할 것.
		// 배열 할당
		test[index++] = 1;
		test[index++] = 2;
		test[index++] = 3;
		test[index++] = 4;

		// 배열의 생성과 할당을 동시에 하는 방법이다.

		/*
		 * System.out.println(test[0]); System.out.println(test[1]);
		 * System.out.println(test[2]); System.out.println(test[3]);
		 */
		// test.length 를 하면 앞의 값에 따라 자동적으로 배열의 길이가 변화하게 된다.
		/*
		 * for( int i =0; i<test.length; i++){ System.out.println(test[i]); }
		 */
		// 굳이 하나하나 입력하지 않아도 for를 입력하고 ctrl+space를 누르면 안으로 여러가지 밑으로 뜸. 그것을 하나 누르면
		// 된다.

		// 배열의 출력
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

		int[] test1 = { 6, 7, 8, 9 };

		int a = test1[1];

		for (int i = 0; i < test.length; i++) {
			System.out.println(test1[i]);
		}

		// index가 필요없을 떄 이 방법을 쓰면 유용하다. (enhanced for문이라고 한다.)
		for (int value : test) {
			System.out.println(value);
		}

		// test1

		for (int i : test1) {
			System.out.println(i);
		}

		System.out.println(test1[3]);

		// test2는 test1의 참조변수가 가르키는 배열과 같은 곳을 참조한다.

		// int 배열이니까 []를 int바로 옆에 붙이는 게 좋아. 그러나 조금 다르게 띄어쓰기 해도 이해할 수 있어야함. []int
		// 이건 안됨.
		int[] test2 = test1;

		// test2[3]의 값을 변경하면 test1[3]의 값도 변경된다.
		// 왜냐하면 test1과 test2의 참조변수가 가리키는 배열이 같기 때문이다.

		test2[3] = 4000;

		System.out.println(test1[3]);
		System.out.println(test2[3]);

		int[][] test3 = new int[2][3];
		test3[0][0] = 10;
		test3[0][1] = 20;
		test3[0][2] = 30;
		test3[1][0] = 40;
		test3[1][1] = 50;
		test3[1][2] = 60;

		int[][] test4 = { { 10, 20, 30 }, { 40, 50, 60 } };

		// 특정 배열만 나오게할 수 잇는 방법입니다.
		for (int n = 0; n < test4.length; n++) {
			for (int m = 0; m < test4[n].length; m++) {
				System.out.println(test4[n][m]);
			}
		}

		// 모든 배열 다 나오게 하는 방법입니다.
		for (int[] is : test4) {
			for (int value : is) {
				System.out.println(value);

			}
		}

		// test5
		int[] test5 = new int[8];
		System.arraycopy(test1, 0, test5, 0, 4);
		

		
		test5[4] = 500;
		test5[5] = 600;
		test5[6] = 700;
		test5[7] = 800;

		

		
		for (int i : test5) {
			System.out.println(i);

		}
	}
}