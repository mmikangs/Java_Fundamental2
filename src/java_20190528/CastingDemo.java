package java_20190528;

public class CastingDemo {

	public static void main(String[] args){
		//byte ������ �Ѿ�� ���� �߻�
		//circuit �߻�
		byte a = (byte) 128;
		System.out.println(a);
		
		/* float, double�� casting �ϴ� ���� �Ҽ��� ���� ©��. 
		cut �߻�  */
		
		int b = (int) 42.5;
		System.out.println(b);
		
		//���� ������ ���ڸ� �������� ������ DB ���ڸ� �ٲ� �� ����. DB �޾ƿͼ� ������ double�� casting�ؼ� �����ؾ� �Ѵ�. 
		int TotalCount = 42;
		int MemberCount = 4;
		
		double c = (double)TotalCount/(double)MemberCount;
		
		/*������ ���� ������ ���� �� �ִ�. INT�� ���� �� �Ҽ����� ��Ÿ�� �� �ֱ� ������ FLOAT�̳� DOUBLE�� ��ȯ�ؼ� �۾��ϴ� ��찡 ����.
		double x = (double)37/(double)4;
		*/
		
		System.out.println(c);
		
		
	}
}
