package q5;

public abstract class Medicine {
	private double price;
	private String expiryDate;
	public void setPrice(double price) {
		this.price = price;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	void getDetails() {
		System.out.println("Price : "+ this.price + "\nExpiry date : " + this.expiryDate);
	}
	abstract void displayLabel();
}
