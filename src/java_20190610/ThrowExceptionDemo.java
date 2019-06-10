package java_20190610;

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg) {
		// Exception Ŭ������ �Ű����� String�λ����ڸ� ȣ�����ش�.
		// msg�����޼����� ����� �������� ����Ѵ�.
		super(msg);
	}
}

class InCorrectAccountException extends Exception {
	InCorrectAccountException(String msg) {
		super(msg);

	}
}

public class ThrowExceptionDemo {
	public static double withdraw(String account, int amount)
			throws InsufficientBalanceException, InCorrectAccountException {
		double balance = 3000;
		String dbAccount = "123-12-123123";

		if (account != null && account.equals(dbAccount)) {
			if (balance - amount >=0) {
				balance = balance - amount;

			} else {
				throw new InsufficientBalanceException("�ܾ��� �����մϴ�.");

			}

		} else {

			throw new InCorrectAccountException("���¹�ȣ�� �߸��Ǿ����ϴ�.");
		}

		return balance;

	}

	public static void main(String[] args) {
		double balance;
		try {
			balance = withdraw("123-12-123123", 3000);
			System.out.println("�ܾ�: " + balance);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (InCorrectAccountException e) {

			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}
}
