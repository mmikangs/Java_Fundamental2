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

		// 2018�⵵������ �� �ϼ��� ���� ����.
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019�⵵ 1�� 1�Ϻ��� 4�� 30�ϱ��� �ϼ� ���ϱ�.

		// �� �迭�� �����Ѵ�.
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 4���ޱ��� for���� �迭�� Ȱ���Ͽ� ���ϴ� ����̴�.

		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];
		}

		// �ش� �⵵�� �������� �Ǵ��ϰ� ������ ���, 3�� �̻��̸� 1�� �����ش�.
		if ((month>= 3) && (year%4==0 && year%100!=0 || year%400==0)) {
			totalCnt++;
		}

		// 2019�� 5�� 28���̱� ������ 28�� ���ϱ�.
		totalCnt += day;
		int rest = totalCnt % 7;
		String dayOfweek = "";
		
		switch(rest){
		case Calendar.MONDAY : dayOfweek = "������"; break;
		case Calendar.TUESDAY : dayOfweek = "ȭ����"; break;
		case Calendar.WEDNESDAY : dayOfweek= "������"; break;
		case Calendar.THURSDAY : dayOfweek= "�����"; break;
		case Calendar.FRIDAY : dayOfweek= "�ݿ���"; break;
		case Calendar.SATURDAY : dayOfweek = "�����"; break;
		case Calendar.SUNDAY : dayOfweek = "�Ͽ���"; break;
		}
		
		System.out.println(year +"�� "+month+"�� "+day+"�� "+dayOfweek+"�Դϴ�.");
		
	}

	}
	

	
