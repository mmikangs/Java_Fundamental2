package java_20190528;

public class SwitchDemo {

	public static void main(String[] args) {

		int month = Integer.parseInt(args[0]);

		// 봄, 여름, 가을, 겨울을 변수처리 한다.

		String season = null;

		switch (month) {

		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "여름";
			break;

		default:
			System.out.println(month + "월은 계절이 아닙니다.");
			break;

		}

		System.out.println(month + "월은 " + season + "입니다.");

	}

}