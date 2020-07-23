
public abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(double amount);
	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	public void rechargeCard(double amount) {
		this.availableBalance = this.availableBalance + amount;
	}
}
