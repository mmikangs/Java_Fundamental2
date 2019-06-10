package java_20190610_re;

public abstract class Parent {

	String name;
	String cphone;
	
	
	//각각 기능이 다른데 부모는 기능이 있어? 없어!!! 가지고 있는 기능이 없어. 부모의 없는 기능이 자식마다 각자 달라.
	//그렇기 때문에 기능을 overriding 하는 것이야. 
	//아무 기능이 없기 떄문에 public 을 abstract으로 바꾸는 것이야!!
	
	
//public void insert(){}
	
//기능이 없는 메서드 (abstract을 붙인다.)
	public abstract void insert();
	
	public abstract void delete(int i);
}
