package java_20190604_re;



public class Car2 {
	String modelNumber;
	String color;
	int year;
	//생성자
	//메소드 명이 클래스 이름과 동일하고, 반환값이 없는 경우
	//인스턴스 변수 초기화 할때 사용한다.
	public Car2(String modelNumber, String color, int year){
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args) {
		Car2 c1 = new Car2("010101000","white",2018);
		System.out.println("첫번째 객체의 멤버변수(인스턴스변수) 출력하기");
		System.out.println(c1.modelNumber + "\t"+c1.color+"\t"+c1.year);

		Car2 c2 = new Car2("010101001","black", 2019);
		System.out.println("두번째 객체의 멤버변수(인스턴스변수) 출력하기");
		System.out.println(c2.modelNumber + "\t"+c2.color+"\t"+c2.year);

		Car2 c3 = new Car2("010101002","red",2017);
		System.out.println("세번째 객체의 멤버변수(인스턴스변수) 출력하기");
		System.out.println(c3.modelNumber + "\t"+c3.color+"\t"+c3.year);
	}

}


