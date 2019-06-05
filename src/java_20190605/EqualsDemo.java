package java_20190605;

import java.util.concurrent.SynchronousQueue;

class Car{
	
	String modelNumber;
	String color;
	int year;
	
	
	//디폴트 생성자 Alt+shift+s => c
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	//Alt+Shift+S -> O+tab-tab-tab-tab-enter
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}

	//SETTER와 GETTER 매소드 만드는 단축키 - Alt+Shift+S -> R+ENTER -> tab-tab-tab-tab-enter

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	//equals and hascode : ALT+SHIT+S -> H (HASH CODE 를 하면된다. - > Car class안에서 해야함.)
//Overriding 하고 싶은 것을 고려하여, 어떤 항목을 overriding할지 선택할 수 있따.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
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
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}


	
	//toString() 매소드 overriding 하는 방법 : alt+sfhit+s => s => ok
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + ", year=" + year + "]";
	}

	
}


public class EqualsDemo {

	public static void main(String[] args) {
	
		Car c1 = new Car("010100000", "black",2018);
		Car c2 = new Car("010100000", "black",2018);
		Car c3 = new Car("010100001", "red", 2019);
		Car c4 = new Car("010100001", "red",2019);
		
		//뒤에 나오는 영문은  해시코드를 16지수로 바꾼 값이다!!!!!System.out.println(c1);
		System.out.println(c1.toString());
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println("c1 hashCode : "+c1.hashCode());
		System.out.println("c2 hashCode : "+c2.hashCode());
		
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));

		System.out.println("c3 hashCode : "+c3.hashCode());
		System.out.println("c4 hashCode : "+c4.hashCode());

		
		
	}
}
