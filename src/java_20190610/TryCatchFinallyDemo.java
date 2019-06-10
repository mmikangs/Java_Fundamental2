package java_20190610;

public class TryCatchFinallyDemo {

	public static double average(int a, int b) {
		int sum = a + b;
		return (double) sum / (double) 2;

	}

	// args�� ����� �� ���� �Է��ϴ� ���̴�.
	public static void main(String[] args) {
		if (args.length != 2) {

			// error���� �ִ� �� err�� ����� ! (Error�� ���õ� message�̱���!)
			System.err.println("usage : java TryCatchFinallyDemo " + "[��������] [��������]");
			// �Ϲ����� ���ڿ� - System.out.println("usage : java TryCatchFinallyDemo
			// "+ "[��������] [��������]");

			return;
		}
		// Integer.parseInt() �ż���� ���ڰ� �ƴ� ���ڿ��� ��� ��, �Ϲ� ���ڿ��� ���
		// NmberFomatException ���ܰ� �߻���.

		try {
			//ArrayIndexOutOfBoundsException
			int korea = Integer.parseInt(args[0]);

			// JVM�� ������ ���� ��Ű��, ���� ��ü�� NumberFormatException ��ü�� ������ �� catch ���� ã�´�.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("���: %.2f", avg);

		} catch (NumberFormatException e) {
			// TODO : handle exception
			//jvm  �޼����� �����ϰ� ��µ�.
			//e.printStackTrace();
			//System.err.println("���� �޼��� :" + e.getMessage());
			System.err.println("���� ���� ���ڸ� �־��ּ���!");
		
			//finally �� ���ܰ� ������ �ƴϵ� �׻� ��Ÿ���� ���̵�!!!!!
		} catch (ArrayIndexOutOfBoundsException e) {
				// TODO : handle exception
				//jvm  �޼����� �����ϰ� ��µ�.
				//e.printStackTrace();
				//System.err.println("���� �޼��� :" + e.getMessage());
				System.err.println("usage : java TryCatchFinallyDemo " + "[��������] [��������]");
		}
		finally {
			System.out.println("\nfinally block");
		}

	}

}
