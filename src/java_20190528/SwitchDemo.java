package java_20190528;

public class SwitchDemo {

	public static void main(String[] args) {

		int month = Integer.parseInt(args[0]);

		// ��, ����, ����, �ܿ��� ����ó�� �Ѵ�.

		String season = null;

		switch (month) {

		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;

		default:
			System.out.println(month + "���� ������ �ƴմϴ�.");
			break;

		}

		System.out.println(month + "���� " + season + "�Դϴ�.");

	}

}