package java_20190610;

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg) {
		// Exception 클래스의 매개변수 String인생성자를 호출해준다.
		// msg에러메세지를 출력할 목적으로 사용한다.
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
				throw new InsufficientBalanceException("잔액이 부족합니다.");

			}

		} else {

			throw new InCorrectAccountException("계좌번호가 잘못되었습니다.");
		}

		return balance;

	}

	public static void main(String[] args) {
		double balance;
		try {
			balance = withdraw("123-12-123123", 3000);
			System.out.println("잔액: " + balance);
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
