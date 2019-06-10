package java_20190610_re;

import java.util.ArrayList;

public class Customer extends Parent {
	
	//ctrl+shift+o (자동 import 방법)

	//ALT+shift+s -> o (생성자 만드는 방법)
	
	ArrayList <Customer> list = new ArrayList<Customer>();
	
	public Customer(String name, String cphone) {
		super();
		this.name = name;
		this.cphone = cphone;
	}

	
	//각각의 class마다 구현이 다르다. 
	public void insert(){
		
		list.add(new Customer(name,cphone));
	}
	
	public void delete(int i){
		list.remove(i);

	}

	
}



