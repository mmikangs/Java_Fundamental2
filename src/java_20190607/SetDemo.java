package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {

		// �ڵ� import : ctrl +shift+ o
		// ���� ���� �� ���ڿ� (string)�� ���� �־��.�ٸ� ���� ��������� compile ������ �߰� ����.

		// HashSet -> �������� �ߺ��� ������� �ʰ� ���� ����. (��ü�� �ߺ��� ������� �ʴ´�.)
		// HashSet<String> set1 = new HashSet<String>();

		// TreeSet -> �������� �ߺ��� ������� �ʰ�, natural ordering (�������� ������ �̷������.)
		// TreeSet<String> set1 = new TreeSet<String>();

		// LinkedHashSet -> �������� �ߺ��� ������� �ʰ�, �Է��� ������� ���. (���� ������� ��µȴ�.)
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();

		for (int i = 0; i < 20; i++) {

			// valueOf (int i)�޼ҵ�� int i�� ���ڿ��� ��ȯ�Ѵ�. -> ����1�� ���ڿ� "1"�� ��ȯ���ش�.
			// ���� �ִ� ����.
			set1.add(String.valueOf(i));

		}
		// HashSet ũ��
		// size �޼ҵ�
		System.out.println(set1.size());

		// ������ ���
		// set�� iterator(�ǹ� : �ݺ���)�� �̾Ƴ��� ��ü�� �̾Ƴ�����. (iterator�� ��ȯ ��Ű�� - hasNext��
		// �ִ��� ������ Ȯ��.)
		// hasNext�� ��� ������ ������� �ִ��� Ȯ���ϰ�
		// ���̻� ������ �� ���� ������ false�� �Ǿ� while���� �������´�.
		// �̿� for���� �ƴ� while���� ����Ѵ�. (iterator�� index�� ���� ������ ���� ���⿡ while��
		// �����.)
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			String temp = (String) iterator.next();
			System.out.println(temp);
		}

		Customer2 c1 = new Customer2("ȫ�浿", 10);
		Customer2 c2 = new Customer2("ȫ�浿", 10);
		Customer2 c3 = new Customer2("ȫ�浿", 10);
		Customer2 c4 = new Customer2("ȫ�浿", 10);

		// ��� �����
		set1.clear();

		// ���� ��ü ����ִµ� �ڲ� �� ��... set�� �� �� overriding�� hashcode�� �ؾ� �ߺ����� ����
		// �ʴ´�.
		HashSet<Customer2> set2 = new HashSet<Customer2>();

		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		set2.add(c4);

		// ���� ��ü��� �����ϰ� �ϳ��� ���� ����. �޸� ���� 4���� ��� ������ ������ ���� ���� ��ü�� ���� �ɷ� �ϰ�
		// �ʹ�.
		// equals �޼���� hashcode overriding �ؾ��Ѵ� �ߴµ�
		// set�� �����ϸ� equals�� hashcode�� �ؾ���.(�Ѵ� overriding �ؾ���..)
		System.out.println(set2.size());

		//set1�� �ִ� �� �����
		//set1.clear();
		
		HashSet<Integer> Set3 = new HashSet<Integer>();
			
		
		//random �����ϱ�.
	
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

	// instance������ private�� ���������� �־�� ��.
	private String name;
	private int age;

	// instance ������ ������ setter, getter�� �Ѵ�.
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