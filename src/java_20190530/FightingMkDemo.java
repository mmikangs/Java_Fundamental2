package java_20190530;

public class FightingMkDemo {

	public static void main(String[] args){
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2){
			System.out.println("Str1�� str2�� ������ reference�Դϴ�");}
		
		if (str1 == str3){
			System.out.println("str1�� str3�� ������ reference�Դϴ�");
		}
		
		if (str3 == str4){
			System.out.println("str3�� str4�� ������ reference�Դϴ�");
		}
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
				
		}
		
		
	}
	
	
	
