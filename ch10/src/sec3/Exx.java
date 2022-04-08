package sec3;

public class Exx {

	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(0);
		try {
			a.withdraw(200);
		} catch (BalanceUnderflowException e) {
			String message = e.getMessage();
			System.out.println(message);
			e.printStackTrace();
		}

	}

}
