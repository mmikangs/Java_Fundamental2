package java_20190607;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		// set과 list는 add라면 map은 put을 활용해 값을 넣음.
		// 내용이 중복되더라도 들어감.
		// key값만 유일하면 된다.

		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("a", "22");

		String temp1 = map.get("a");
		String temp2 = map.get("b");
		String temp3 = map.get("c");
		String temp4 = map.get("d");

		System.out.printf("%s ,%s ,%s ,%s %n", temp1, temp2, temp3, temp4);

		// keySet() 메서드는 HashMap에 있는 모든 키값을 Set으로 반환
		Set<String> keys = map.keySet();

		Iterator<String> i = keys.iterator();
		while (i.hasNext()) {
			String key = i.next();
			String value = map.get(key);
			System.out.printf("%n key : %s, value : %s %n", key, value);
		}

	}
}
