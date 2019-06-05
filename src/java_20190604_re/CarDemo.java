package java_20190604_re;

public class CarDemo {

	

public static void main(String[] args){

	Car c1 = new Car();
	c1.modelNumber = "01033677775";
	c1.color = "white";
	c1.year = 2018;
	
	
	c1.whatIsColor();
	String msg = c1.getColor();
	System.out.println(msg);
	
	Car c2 = new Car();
	c2.modelNumber = "01051513414";
	c2.color = "black";
	c2.year = 2018;

	
}
}
