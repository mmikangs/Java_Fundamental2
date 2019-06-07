package java_20190607;

import java.util.ArrayList;

//제너릭으로 선언되는게 중요

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		//integer class가 들어간거야. 무조건 obejct타입만 들어갈 수 있어. 자동으로 boxing이 된다. 
		//실행할 때 에러가 나는.....
		//list1.add(10);
		
		for ( int i =0 ; i<list1.size(); i++){
			//collection을 썼을 때에는 generic을 활용해서 해야 에러가 안남. casting도 안해도됨.
			String temp = list1.get(i);
			//casting을 하지 않아도 돼.
			//String temp = (String)list1.get(i);
			System.out.println(temp);
		}
		
		//Generic이 안되면 - enhance for문도 못써 
		// 해당 문장 error 난다? -> for (String temp : list)
	
	}
	
}
