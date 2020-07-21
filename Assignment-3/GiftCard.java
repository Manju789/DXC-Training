package Demo;

public class GiftCard {
	private long cardNo;
	private double balance;
	private boolean active;
	public GiftCard(long cardNo, double balance, boolean active) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
		this.active = active;
	}
	public GiftCard() {
		//super();
		this.balance=0;
	}
	public void rechargeCard(double amount) {
		if(active) {
			this.balance=this.getBalance()+amount;
			System.out.println("Card recharged successfully");
		}
		else
			System.out.println("Card is inactive");
	}
	public void swipeCard(double amount) {
		if(this.active==true && this.balance>amount) {
			this.balance=this.getBalance()-amount;
			System.out.println("Swipe success");
			System.out.println("Balance : " + this.balance);
		}
		else
			System.out.println("Insufficient balance");
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public double getBalance() {
		return balance;
	}
	/*public void setBalance(double balance) {
		this.balance = balance;
	}*/
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
