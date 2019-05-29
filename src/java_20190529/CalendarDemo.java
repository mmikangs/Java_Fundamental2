package java_20190529;

public class CalendarDemo {

	public static void main(String[] args) {

		// 1년 1월 1일은 월요일이다!!!!!!(달력 만들 때 알아야하는 부분)
		// Integer.pareseInt
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = Integer.parseInt(args[2]);

		// 2018년도 preYear
		int preYear = year - 1;
		int preMonth = month - 1;

		int totalCnt = 0;

		// 2018년도까지의 총 일수를 구한 것임.
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019년도 1월 1일부터 4월 30일까지 일수 구하기.

		// 월 배열을 생성한다.
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 4월달까지 for문에 배열을 활용하여 구하는 방법이다.

		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];
		}

		// 해당 년도가 윤년인지 판단하고 윤년인 경우, 3월 이상이면 1을 더해준다.
		if ((month>= 3) && (year%4==0 && year%100!=0 || year%400==0)) {
			totalCnt++;
		}

		// 2019년 5월 28일이기 때문에 28일 더하기.
		totalCnt += date;
		int rest = totalCnt % 7;
		String day = "";
		
		switch(rest){
		case 1 : day = "월요일"; break;
		case 2 : day = "화요일"; break;
		case 3 : day = "수요일"; break;
		case 4 : day = "목요일"; break;
		case 5 : day = "금요일"; break;
		case 6 : day = "토요일"; break;
		case 0 : day = "일요일"; break;
		}
		
		System.out.println(year +"년 "+month+"월 "+date+"일 "+day+"입니다.");
		
	}
}
