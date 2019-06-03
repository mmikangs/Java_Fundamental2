package java_20190603;

public class CallByReferenceDemo {
	public static void change (int i, int[] a, String str){
		i = 20;
		a[2] = 3000;
		str = str + "def"; //원래 쓰는 표현은 str += "def";
	} // change라는 매소드가 있어. 

	
	public static void main(String[] args){
		int i = 10; 
		int [] a = {10,20,30,40}; //배열로 선언.
		String tt = "abc";
		System.out.println("i : "+i); // i가 당연히 10이 나올거야.
		System.out.println(a[2]);// 3번째 방을 찍으면 30이 나올거야.
		System.out.println(tt);
		change(i, a, tt); //i에 10 넘긴 것, i를 20으로 바뀌는데 value값은 절대 안바뀜. 
		//change라는 함수를 활용해 (i 는 call by value (값을 넘긴 것) , a 는 call by reference)
		//call by reference는 같은 객체를 참조한다. 
		
		System.out.println("i: "+i); //call by value - int 값이기 때문에 (값이 변하지 않는다.)
		System.out.println(a[2]); // call by reference - array이기 때문에 (값이 변한다.)
		System.out.println(tt); //call by reference 임에도 불구하고 갔다와도 값이 변하지 않는다. 
								//***** String class를 이해해야 하는 부분이고 call by reference랑 무관함!!!
		
		}
	}

