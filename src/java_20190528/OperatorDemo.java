package java_20190528;

public class OperatorDemo {

	public static void main(String[] args) {
		/*
		 * �޷� ����� 1. 1�� 1�� 1�� ������ 2. ������ 4�⸶�� �߻��ϰ� �� �߿� 100���� ����� �����ϰ� 400���� �����
		 * �������� �ʴ´�. 3. 2019�� 5�� 28���� ������ ���Ϸ��� 2018�� ���� �� �ϼ��� ���ϰ�,2019�� 1������
		 * 4������ �ϼ��� ���ϸ� 28���� ���ϸ� �� �ϼ��� ����. 4. �� �ϼ� 7�� ���� �������� 1�̸� ������, 2�̸� ȭ����,
		 * 3�̸� ������, 4�̸� �����, 5�̸� �ݿ���, 6�̸� �����, 0�̸� �Ͽ����̴�.
		 */

		int year = 2020;
		int month = 5;
		int date = 28;

		// 2018�⵵ preYear
		int preYear = year - 1;
		int preMonth = month - 1;

		int totalCnt = 0;

		// 2018�⵵������ �� �ϼ��� ���� ����.
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019�⵵ 1�� 1�Ϻ��� 4�� 30�ϱ��� �ϼ� ���ϱ�.
		totalCnt += (31 + 28 + 31 + 30);

		// �����̸� total cnt �� ������Ű�� ���ǹ��� �־�� �Ѵ�.
		totalCnt++;

		// 2019�� 5�� 28���̱� ������ 28�� ���ϱ�.
		totalCnt += 28;

		int rest = totalCnt % 7;

		System.out.println(rest);

		// 2�� �������μ� 2019�⵵ 5�� 28���� ȭ�������� �� �� ����.

		// 2020���� ���� �����̱� ������, totalCnt�� totalCnt++�� �������μ� ��¥�ϼ��� �ø��ٴ� ���� �� ��
		// �ִ�.

		// a++ �� ++a�� ���� �ٸ���.

		int s = 10;

		s++;

		System.out.println(s);

		int m = 1;

		System.out.println(m++);
		System.out.println(++m);

		// �� ���� ���� ������ ? �� Ȱ���� ���ö�� �� �� �ִ�.

		int temp = 123;
		int share = temp % 1 == 0 ? temp / 10 : temp / 10 + 1;
		System.out.println(share);

		// ���ǹ��� ���� �� if������ ����.

		if (temp == 0) {

			share = temp / 10;
		} else {
			share = temp / 10 + 1;
		}
		System.out.print(share);

	}
}
