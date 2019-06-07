package java_20190607;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {

		// 데이터의 중복을 허용하고, 순서를 관리한다.
		ArrayList<String> list = new ArrayList<String>();
		
		//입력 add(객체);
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("4");

		//출력 get(index) - collection 자체를 get으로 하기보단 enhance for문을 사용하는 경우가 대부분
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		
		//이 아래 방법을 더 많이 선호한다.!!
		//배열에서 사용하는 enhance for문은 list에서도 사용이 가능하다.
		for (String temp : list)
		{
			System.out.println(temp);
			}

		list.remove(2);
		String temp = list.get(2);
		System.out.println(temp);
		
		}
	
	

}