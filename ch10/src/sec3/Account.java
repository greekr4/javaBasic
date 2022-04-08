package sec3;

public class Account {
	private int balance;
	
	public Account() {}

	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	public void deposit(int money) {
		balance +=money;
	}
	public void withdraw(int money) throws BalanceUnderflowException{
		if(balance < money) {
			System.out.println("X");
			throw new BalanceUnderflowException("잔고 부족 : "+(money-balance));
		}
	}
}
