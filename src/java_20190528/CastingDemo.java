package java_20190528;

public class CastingDemo {

	public static void main(String[] args){
		//byte 범위를 넘어가면 에러 발생
		//circuit 발생
		byte a = (byte) 128;
		System.out.println(a);
		
		/* float, double로 casting 하는 경우는 소수점 이하 짤림. 
		cut 발생  */
		
		int b = (int) 42.5;
		System.out.println(b);
		
		//보통 정해진 숫자를 가져오기 때문에 DB 숫자를 바꿀 수 없음. DB 받아와서 각각을 double로 casting해서 진행해야 한다. 
		int TotalCount = 42;
		int MemberCount = 4;
		
		double c = (double)TotalCount/(double)MemberCount;
		
		/*나누는 것은 문제가 생길 수 있다. INT로 나눌 땐 소수점이 나타날 수 있기 때문에 FLOAT이나 DOUBLE로 변환해서 작업하는 경우가 많다.
		double x = (double)37/(double)4;
		*/
		
		System.out.println(c);
		
		
	}
}
