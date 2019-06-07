package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {

		// 자동 import : ctrl +shift+ o
		// 집어 넣을 때 문자열 (string)만 집어 넣어라.다른 것을 집어넣으면 compile 에러가 뜨게 하자.

		// HashSet -> 데이터의 중복을 허용하지 않고 순서 없음. (객체의 중복을 허용하지 않는다.)
		// HashSet<String> set1 = new HashSet<String>();

		// TreeSet -> 데이터의 중복을 허용하지 않고, natural ordering (오름차순 정렬이 이루어진다.)
		// TreeSet<String> set1 = new TreeSet<String>();

		// LinkedHashSet -> 데이터의 중복을 허용하지 않고, 입력한 순서대로 출력. (넣은 순서대로 출력된다.)
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();

		for (int i = 0; i < 20; i++) {

			// valueOf (int i)메소드는 int i를 문자열로 변환한다. -> 숫자1을 문자열 "1"로 변환해준다.
			// 집어 넣는 과정.
			set1.add(String.valueOf(i));

		}
		// HashSet 크기
		// size 메소드
		System.out.println(set1.size());

		// 데이터 출력
		// set은 iterator(의미 : 반복자)로 뽑아내서 객체를 뽑아내야함. (iterator로 변환 시키고 - hasNext로
		// 있는지 없는지 확인.)
		// hasNext는 계속 데이터 끄집어내고 있는지 확인하고
		// 더이상 끄집어 낼 것이 없으면 false가 되어 while문을 빠져나온다.
		// 이에 for문이 아닌 while문을 사용한다. (iterator는 index가 없고 증가할 것이 없기에 while을
		// 써야해.)
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			String temp = (String) iterator.next();
			System.out.println(temp);
		}

		Customer2 c1 = new Customer2("홍길동", 10);
		Customer2 c2 = new Customer2("홍길동", 10);
		Customer2 c3 = new Customer2("홍길동", 10);
		Customer2 c4 = new Customer2("홍길동", 10);

		// 모두 지우기
		set1.clear();

		// 같은 객체 집어넣는데 자꾸 다 들어가... set을 할 때 overriding과 hashcode를 해야 중복으로 들어가지
		// 않는다.
		HashSet<Customer2> set2 = new HashSet<Customer2>();

		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		set2.add(c4);

		// 같은 객체라고 생각하고 하나만 들어가길 원해. 메모리 상은 4개가 있찌만 실제로 내용이 같은 같은 객체로 보는 걸로 하고
		// 싶다.
		// equals 메서드와 hashcode overriding 해야한다 했는데
		// set에 저장하면 equals와 hashcode를 해야해.(둘다 overriding 해야함..)
		System.out.println(set2.size());

		//set1에 있는 것 지우기
		//set1.clear();
		
		HashSet<Integer> Set3 = new HashSet<Integer>();
			
		
		//random 값구하기.
	
		while (true){
			int random = (int)(Math.random()*45)+1;
			Set3.add(random);
			if(Set3.size() ==6 ) break;
		}
		
		Iterator<Integer> i = Set3.iterator();
		
		while (i.hasNext()){
			Integer temp = i.next();
			System.out.print(temp + "\t");
		}
		
		
		
	}

}

class Customer2 {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer2 other = (Customer2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// instance변슈는 private을 습관적으로 넣어야 함.
	private String name;
	private int age;

	// instance 변수를 변경할 setter, getter를 한다.
	// ALT+SHIFT+S -> R+ENTER
	public Customer2(String anme, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}