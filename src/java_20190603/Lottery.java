package java_20190603;


import java.util.HashSet;
/*
public class Lottery {

	public void print(int count) {
		// TODO Auto-generated method stub
		
	}

import java.util.HashSet;

public class Lottery {

	public static void print(int count) {
		int random = (int) (Math.random() * 45) + 1;
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			process();
		}

	}

	public static void process() {
		
		 * HashSet<Integer> set = new HashSet<Integer>(); while(true){ int
		 * random = (int)(Math.random()* 45) + 1; set.add(random);
		 * if(set.size()==6) break; }
		 

		int[] temp = new int[6];
		for (int i = 0; i < temp.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			temp[i] = random;
			for (int k = 0; k < i; k++) {
				if (temp[k] == temp[i]) {
					random = (int) (Math.random() * 45) + 1;
					temp[i] = random;
					k = -1;
				}
			}
		}
		// bubbleSort(temp);
		for (int value : temp) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}

	private static void bubbleSort(int[] array) {
		int temp = 0;
		int size = array.length - 1;
		int count = size;
		int index = 0;
		for (int i = 0; i < size; i++) {
			index++;
			for (int j = 0; j < count; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
				index++;
			}
			count--;
		}

		for (int value : array) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}

	}

	
	 * import java.util.HashSet;
	 * 
	 * public class Lottery {
	 * 
	 * public void print(int count) {
	 * 
	 * for (int i = 0; i < count; i++) { process(); }
	 * 
	 * 
	 * public static void process(){ HashSet <Integer> set = new
	 * HashSet<Integer>(); while (true){ int random = (int)(Math.random()*45)+1;
	 * set.add(random); if(set.size()==6) break;
	 * 
	 * }
	  
		 * int[]temp = new int[6]; for(int i=0;i<temp.length;i++){ int random =
		 * (int)(Math.random()*45)+1; temp[i] = random; for(int k=0;k<i;k++){
		 * if(temp[k]==temp[i]){ random = (int)(Math.floor(Math.random()*45))+1;
		 * temp[i] = random; //-1로 해둔 이유는 처음부터 보기 위해서이다. k=-1;
		 * 
		 * } } }
		 
	bubbleSort(temp);

	
	 * / for (int value : temp){ System.out.println(value + "\t");
	 * 
	 * }
	 
	private static void bubbleSort(int[] array) {
		int temp = 0;
		int size = array.length - 1;
		int count = size;
		int index = 0;
		for (int i = 0; i < size; i++) {
			index++;
			for (int j = 0; j < count; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
				index++;
			}
			count--;

		}

	}

	
	 * for (int i=0; i<) index++; for(int j=0;j<) if(array[j])
	 * 
	 * int random = (int)Math.random()*45+1;
	 * 
	 * //int[] test = new int[6];
	 * 
	 * inte
	 * 
	 * System.out.println(random);
	 * 
	 * }
	 

}

// }

// }
*/