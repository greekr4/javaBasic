package Exercise;

public class Account {

	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (this.MIN_BALANCE <= balance && balance <= this.MAX_BALANCE)
		{
		this.balance = balance;
		} else
		{
			
		}
	}
	
}
