package java_20190603;

public class CallByReferenceDemo {
	public static void change (int i, int[] a, String str){
		i = 20;
		a[2] = 3000;
		str = str + "def"; //���� ���� ǥ���� str += "def";
	} // change��� �żҵ尡 �־�. 

	
	public static void main(String[] args){
		int i = 10; 
		int [] a = {10,20,30,40}; //�迭�� ����.
		String tt = "abc";
		System.out.println("i : "+i); // i�� �翬�� 10�� ���ðž�.
		System.out.println(a[2]);// 3��° ���� ������ 30�� ���ðž�.
		System.out.println(tt);
		change(i, a, tt); //i�� 10 �ѱ� ��, i�� 20���� �ٲ�µ� value���� ���� �ȹٲ�. 
		//change��� �Լ��� Ȱ���� (i �� call by value (���� �ѱ� ��) , a �� call by reference)
		//call by reference�� ���� ��ü�� �����Ѵ�. 
		
		System.out.println("i: "+i); //call by value - int ���̱� ������ (���� ������ �ʴ´�.)
		System.out.println(a[2]); // call by reference - array�̱� ������ (���� ���Ѵ�.)
		System.out.println(tt); //call by reference �ӿ��� �ұ��ϰ� ���ٿ͵� ���� ������ �ʴ´�. 
								//***** String class�� �����ؾ� �ϴ� �κ��̰� call by reference�� ������!!!
		
		}
	}

