package java_20190611;

import java.io.File;
import java.util.Calendar;

public class FileDemo {
	public boolean mkdirs(String path) {
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (!isExisted) {
			isSuccess = f1.mkdirs();
		}
		return isSuccess;
	}

	public String getComma(int number) {
		return String.format("%,d", number);
	}

	public String getComma(long number) {
		return String.format("%,d", number);
	}

	public String getComma(double number, int precision) {
		return String.format("%,." + precision + "f", number);
	}

	public String getComma(double number) {
		return String.format("%,f", number);
	}

	//
	public boolean changeFile(String path) {
		// path => C:\down\2019\06\11\jdk.exe
		File f1 = new File(path);
		String fileName = f1.getName();// jdk.exe

		String name = fileName.substring(0, fileName.lastIndexOf("."));// jdk
		String extension = fileName.substring(fileName.lastIndexOf("."));// .exe
		name = String.valueOf(System.currentTimeMillis());// 123123
		name = name + extension;// 123123.zip

		String parent = f1.getParent();// C:\down\2019\06\11
		File f2 = new File(parent, name);// parent=>C:\down\2019\06\11
											// name=>123123.zip
		return f1.renameTo(f2);
	}

	public static void main(String[] args) {
		FileDemo f = new FileDemo();
		// f.mkdirs("c:\\down2\\2019\\06\\11");

		File f1 = new File("c:\\down\\eclipse-jee-mars-R-win32-x86_64.zip");
		long fileSize = f1.length();

		String fileLength = f.getComma(Math.round((double) fileSize / (double) 1024));
		System.out.println(fileLength + "KB");

		f.changeFile("C:\\dev\\2019\\fighting.txt");
		File f2 = new File("C:\\down\\2019\\06\\11\\1560233549970.txt");
		f2.delete();

		File f3 = new File("c:\\");
		String[] list = f3.list();
		for (String value : list) {
			File f4 = new File(f3, value);
			if (f4.isDirectory()) {
				System.out.println(value + "- 디렉토리");
			} else if (f4.isFile()) {
				long size = f4.length();
				System.out.println(value + "- 파일(" + size + ")");
			}
		}

		File f5 = new File("C:\\dev\\2019\\fighting.txt");
		long lastModified = f5.lastModified();

		Calendar c = Calendar.getInstance();
		c.set(2019, 5, 10);
		// c.setTimeInMillis(lastModified);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);

		System.out.print(year + "년" + month + "월" + day + "일 ");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case Calendar.MONDAY:
			System.out.println("월요일 입니다.");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일 입니다.");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일 입니다.");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일 입니다.");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일 입니다.");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일 입니다.");
			break;
		case Calendar.SUNDAY:
			System.out.println("일요일 입니다.");
			break;
		}

	}
}