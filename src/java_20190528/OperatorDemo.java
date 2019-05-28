package java_20190528;

public class OperatorDemo {

	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일 월요일 2. 윤년은 4년마다 발생하고 그 중에 100년의 배수는 제외하고 400년의 배수는
		 * 제외하지 않는다. 3. 2019년 5월 28일의 요일을 구하려면 2018년 까지 총 일수를 구하고,2019년 1월부터
		 * 4월까지 일수를 구하며 28일을 더하면 총 일수가 나옴. 4. 총 일수 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,
		 * 3이면 수요일, 4이면 목요일, 5이면 금요일, 6이면 토요일, 0이면 일요일이다.
		 */

		int year = 2020;
		int month = 5;
		int date = 28;

		// 2018년도 preYear
		int preYear = year - 1;
		int preMonth = month - 1;

		int totalCnt = 0;

		// 2018년도까지의 총 일수를 구한 것임.
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019년도 1월 1일부터 4월 30일까지 일수 구하기.
		totalCnt += (31 + 28 + 31 + 30);

		// 윤년이면 total cnt 를 증가시키는 조건문이 있어야 한다.
		totalCnt++;

		// 2019년 5월 28일이기 때문에 28일 더하기.
		totalCnt += 28;

		int rest = totalCnt % 7;

		System.out.println(rest);

		// 2가 나옴으로서 2019년도 5월 28일이 화요일임을 알 수 있음.

		// 2020년의 경우는 윤년이기 때문에, totalCnt를 totalCnt++을 해줌으로서 날짜일수를 늘린다는 것을 알 수
		// 있다.

		// a++ 과 ++a의 값은 다르다.

		int s = 10;

		s++;

		System.out.println(s);

		int m = 1;

		System.out.println(m++);
		System.out.println(++m);

		// 이 경우는 조건 연산자 ? 를 활용한 예시라고 볼 수 있다.

		int temp = 123;
		int share = temp % 1 == 0 ? temp / 10 : temp / 10 + 1;
		System.out.println(share);

		// 조건문은 거의 다 if문으로 쓴다.

		if (temp == 0) {

			share = temp / 10;
		} else {
			share = temp / 10 + 1;
		}
		System.out.print(share);

	}
}
