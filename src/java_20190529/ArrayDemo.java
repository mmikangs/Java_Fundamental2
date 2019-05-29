package java_20190529;

public class ArrayDemo {

	public static void main(String[] args) {

		// int �迭 ����
		// new int[4] -> size�� �ǹ�
		int[] test = new int[4];
		int index = 0;
		// ++index�� �ϸ� �ȵ�. ���� ù��° ���� ����ְ� �Ǵϱ�.
		// �ڵ��ϴٰ� ��Ģ�� ����� ��Ģ�� �� Ȱ���� ��.
		// �迭 �Ҵ�
		test[index++] = 1;
		test[index++] = 2;
		test[index++] = 3;
		test[index++] = 4;

		// �迭�� ������ �Ҵ��� ���ÿ� �ϴ� ����̴�.

		/*
		 * System.out.println(test[0]); System.out.println(test[1]);
		 * System.out.println(test[2]); System.out.println(test[3]);
		 */
		// test.length �� �ϸ� ���� ���� ���� �ڵ������� �迭�� ���̰� ��ȭ�ϰ� �ȴ�.
		/*
		 * for( int i =0; i<test.length; i++){ System.out.println(test[i]); }
		 */
		// ���� �ϳ��ϳ� �Է����� �ʾƵ� for�� �Է��ϰ� ctrl+space�� ������ ������ �������� ������ ��. �װ��� �ϳ� ������
		// �ȴ�.

		// �迭�� ���
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

		int[] test1 = { 6, 7, 8, 9 };

		int a = test1[1];

		for (int i = 0; i < test.length; i++) {
			System.out.println(test1[i]);
		}

		// index�� �ʿ���� �� �� ����� ���� �����ϴ�. (enhanced for���̶�� �Ѵ�.)
		for (int value : test) {
			System.out.println(value);
		}

		// test1

		for (int i : test1) {
			System.out.println(i);
		}

		System.out.println(test1[3]);

		// test2�� test1�� ���������� ����Ű�� �迭�� ���� ���� �����Ѵ�.

		// int �迭�̴ϱ� []�� int�ٷ� ���� ���̴� �� ����. �׷��� ���� �ٸ��� ���� �ص� ������ �� �־����. []int
		// �̰� �ȵ�.
		int[] test2 = test1;

		// test2[3]�� ���� �����ϸ� test1[3]�� ���� ����ȴ�.
		// �ֳ��ϸ� test1�� test2�� ���������� ����Ű�� �迭�� ���� �����̴�.

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

		// Ư�� �迭�� �������� �� �մ� ����Դϴ�.
		for (int n = 0; n < test4.length; n++) {
			for (int m = 0; m < test4[n].length; m++) {
				System.out.println(test4[n][m]);
			}
		}

		// ��� �迭 �� ������ �ϴ� ����Դϴ�.
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