package java_20190531;

//class안에서 메소드 이름이 같아도 상관 없다.

public class Overloading {

//함수 이름이 같으면서 형이 다르잖아.
	public void print(int i) {

		System.out.println(i);
	}

	public void print(String s) {
		System.out.println(s);
	}

	public void print(double d) {
		System.out.println(d);
	}
	
	//잘못된 코드 (print로 해야하는데 printint ln 이런식으로 어떻게 할거야? print는 print , 매개변수는 목적어.
	
	public void printInt (int i){
		System.out.println(i);
		
	}
	
	//overloading하는 방법. 구분은 searchid 뒤에 이렇게 붙이는 건 불편하고 남들이 쓰기에 불편해. 그래서 최대한 overloading해서 쓰는게 좋아
	//overloading은 매개변수의 개수와 유형을 다르게 해서 추가하는 방향으로 진행할 것.
	
	public void search(String id){	
	}
	
	public void search(String f, String e){
		
	}
	
	public void search(String f, String m, String e){
	}
	
	public void search(String zipcode, int flag, String address){		
	}

}

	

