package java_20190531;

public class Calendar {

public static final int SUNDAY = 0;
public static final int MONDAY = 1;
public static final int TUESDAY = 2;
public static final int WEDNESDAY = 3;
public static final int THURSDAY = 4;
public static final int FRIDAY = 5;
public static final int SATURDAY = 6;

public boolean isLeafYear(int year)
{
	boolean isLeafYear = false;
	if(year%4==0 && year%100!=0 || year%400==0){
		isLeafYear = true;
	}
	return isLeafYear;
	
}
public int getLastDay(int year, int month){
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	if(isLeafYear(year)){

		monthArray[1]=29;		
	}
	return monthArray[month-1];
}

	public void print(int year){		
		// TODO Auto-generated method stub

	}
	public void print(int year, int month) {
		// TODO Auto-generated method stub	
	}
	public void print(int year, int month, int day) {
		// TODO Auto-generated method stub
	
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
		totalCnt += day;
		int rest = totalCnt % 7;
		String dayOfweek = "";
		
		switch(rest){
		case Calendar.MONDAY : dayOfweek = "월요일"; break;
		case Calendar.TUESDAY : dayOfweek = "화요일"; break;
		case Calendar.WEDNESDAY : dayOfweek= "수요일"; break;
		case Calendar.THURSDAY : dayOfweek= "목요일"; break;
		case Calendar.FRIDAY : dayOfweek= "금요일"; break;
		case Calendar.SATURDAY : dayOfweek = "토요일"; break;
		case Calendar.SUNDAY : dayOfweek = "일요일"; break;
		}
		
		System.out.println(year +"년 "+month+"월 "+day+"일 "+dayOfweek+"입니다.");
		
	}

	}
	

	
