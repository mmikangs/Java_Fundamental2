package java_20190607;

import java.util.ArrayList;

//���ʸ����� ����Ǵ°� �߿�

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		//integer class�� ���ž�. ������ obejctŸ�Ը� �� �� �־�. �ڵ����� boxing�� �ȴ�. 
		//������ �� ������ ����.....
		//list1.add(10);
		
		for ( int i =0 ; i<list1.size(); i++){
			//collection�� ���� ������ generic�� Ȱ���ؼ� �ؾ� ������ �ȳ�. casting�� ���ص���.
			String temp = list1.get(i);
			//casting�� ���� �ʾƵ� ��.
			//String temp = (String)list1.get(i);
			System.out.println(temp);
		}
		
		//Generic�� �ȵǸ� - enhance for���� ���� 
		// �ش� ���� error ����? -> for (String temp : list)
	
	}
	
}
