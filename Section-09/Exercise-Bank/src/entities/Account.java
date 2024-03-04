package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		
		setNumber(number);
		setHolder(holder);
		balanceDeposit(balance);
	}
	
	public Account(int number, String holder ) {
		
		setNumber(number);
		setHolder(holder);
	}
	
	public int getNumber() {
		
		return number;
	}
	
	public String getHolder() {
		
		return holder;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	private void setNumber(int number) {
		
		this.number = number;
	}
	
	public void setHolder(String holder) {
		
		this.holder = holder;
	}
	
	public void balanceDeposit(double balance) {
		
		this.balance += balance;
	}
	
	public void balanceWithdraw(double balance) {
		
		this.balance -= balance + 5;
	}
	
	@Override
	public String toString() {
		
		return    "Account "
				+ getNumber()
				+ ", Holder: "
				+ getHolder()
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance());
	}
}
