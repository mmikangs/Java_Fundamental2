package java_20190531;

public class Calendar {

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	//윤년인지 아닌지를 판단하는 메서드
	//매개변수가 윤년이면 true이고, 아니면 false.
	private boolean isLeafYear(int year) {
		
		//윤년이냐? 아니?
		boolean isLeafYear = false;
		
		//이러한 조건이면 윤년이야 (이러한 조건이면 true로 바꿔줄게)
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			isLeafYear = true; 
			}
		return isLeafYear;
	}

	
	//1년 1월 1일부터 ~ 년, 월, 일의 총일수를 구하는 메서드.
	private int getCount(int year, int month, int day) {
	
		//총일수 구할때는 년도는 이전년도까지 일수를 구해야하기 때문에 preYear 변수를 설정	
		int preYear = year - 1;
		//해당 년도의 이전달을 저장하기 위한 변수(해당 월 -1)
		int preMonth = month - 1;
		int totalCnt = 0;
		
		// 2018년도까지의 총 일수를 구하기. (4의 배수가 윤년인데 100의 배수는 윤년이 아니고 400은 윤년이니까)
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		
		// 2019년도 1월 1일부터 4월 30일까지 일수 구하기.
		// 월 배열을 생성한다.
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 4월달까지 for문에 배열을 활용하여 구하는 방법이다.
		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];
		}

		// 해당 년도가 윤년인지 판단하고 윤년인 경우, 3월 이상이면 1을 더해준다.

		if ((month >= 3) && isLeafYear(year)) {
			totalCnt++;
		}

		// 2019년 5월 28일이기 때문에 28일 더하기.
		totalCnt += day;
		return totalCnt;
	}

	
	//년도의 매월 마지막날짜를 구하는 메서드
	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}

	public void print(int year) {
		System.out.println(year + "년 달력입니다.");
		for (int i = 1; i <= 12; i++) {
			print(year, i);
			System.out.println();
		}
	}

	// 이 부분이 핵심(**********)
	public void print(int year, int month) {

		//print 함수
		System.out.println(year + "년" + month + "월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 시작 날짜
		int start = 1;
		//마지막 날짜
		int end = getLastDay(year, month);
		
		//요일을 구함. (ex. 2019년 5월 1일의 요일을 구함.) - 요일과 공백이 딱 맞아.
		//rest가 아닌 dayOfweek
		int dayOfWeek = getCount(year, month, 1) % 7;
		
		//요일수 만큼 탭 처리
		//월요일이면 dayOfWeek가 -> 1
		//화요일이면 dayOfweek가 -> 2
		//토요일이면 dayOfweek가 -> 6
		//일요일이면 dayOfweek가 -> 0
	
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = start; i <= end; i++) {
			System.out.print(i + "\t");
			//dayOfweek를 증가해서
			dayOfWeek++;
			//dayOfweek가 7이 되면, 개행을 해준다.( 일요일로 바꿔줘야 한다.)
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	// 년, 월, 일
	public void print(int year, int month, int day) {

		//getCount 해당 년, 월, 일의 총 날짜를 구할 수 있어.
		int totalCnt = getCount(year, month, day);
		int rest = totalCnt % 7;
		String dayOfweek = "";

		switch (rest) {
		case Calendar.MONDAY:
			dayOfweek = "월요일";
			break;
		case Calendar.TUESDAY:
			dayOfweek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dayOfweek = "수요일";
			break;
		case Calendar.THURSDAY:
			dayOfweek = "목요일";
			break;
		case Calendar.FRIDAY:
			dayOfweek = "금요일";
			break;
		case Calendar.SATURDAY:
			dayOfweek = "토요일";
			break;
		case Calendar.SUNDAY:
			dayOfweek = "일요일";
			break;
		}

		System.out.println(year + "년 " + month + "월 " + day + "일 " + dayOfweek + "입니다.");

	}

}
