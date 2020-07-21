package Demo;

public class Account {
	Double balance;
	boolean active;
	int accNo;
	public Account(int accNo,Double balance, boolean active) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.active = active;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void depositAmount(double amount) {
		if(isActive())
			this.balance = this.balance + amount;
	}
	public void withdrawAmount(double amount) {
		if (this.balance >= amount)
			this.balance = this.balance - amount;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
