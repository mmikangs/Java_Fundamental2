package java_20190610;

public class TryCatchFinallyDemo {

	public static double average(int a, int b) {
		int sum = a + b;
		return (double) sum / (double) 2;

	}

	// args는 실행시 때 값을 입력하는 것이다.
	public static void main(String[] args) {
		if (args.length != 2) {

			// error성이 있는 건 err를 사용해 ! (Error와 관련된 message이구나!)
			System.err.println("usage : java TryCatchFinallyDemo " + "[국어점수] [영어점수]");
			// 일반적인 문자열 - System.out.println("usage : java TryCatchFinallyDemo
			// "+ "[국어점수] [영어점수]");

			return;
		}
		// Integer.parseInt() 매서드는 숫자가 아닌 문자열일 경우 즉, 일반 문자열일 경우
		// NmberFomatException 예외가 발생됨.

		try {
			//ArrayIndexOutOfBoundsException
			int korea = Integer.parseInt(args[0]);

			// JVM은 실행을 중지 시키고, 예외 객체인 NumberFormatException 객체를 생성한 후 catch 블럭을 찾는다.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("평균: %.2f", avg);

		} catch (NumberFormatException e) {
			// TODO : handle exception
			//jvm  메세지와 동일하게 출력됨.
			//e.printStackTrace();
			//System.err.println("예외 메세지 :" + e.getMessage());
			System.err.println("문자 말고 숫자를 넣어주세요!");
		
			//finally 는 예외가 나오든 아니든 항상 나타나는 것이돠!!!!!
		} catch (ArrayIndexOutOfBoundsException e) {
				// TODO : handle exception
				//jvm  메세지와 동일하게 출력됨.
				//e.printStackTrace();
				//System.err.println("예외 메세지 :" + e.getMessage());
				System.err.println("usage : java TryCatchFinallyDemo " + "[국어점수] [영어점수]");
		}
		finally {
			System.out.println("\nfinally block");
		}

	}

}
