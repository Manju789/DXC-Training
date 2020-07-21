package Demo;

public class GiftCardTest {
	public static void main(String[] args) {
		GiftCard card1=new GiftCard(99776555,5000,true);
		card1.rechargeCard(2000);
		card1.swipeCard(400);
		card1.swipeCard(500);
		System.out.println(card1.getBalance());
		System.out.println(card1.getCardNo());
		System.out.println(card1.isActive());
		GiftCard card2=new GiftCard();
		//card2.setBalance(4000);
		card2.setCardNo(64282930);
		card2.setActive(true);
		card2.rechargeCard(3000);
		card2.swipeCard(500);
		card2.swipeCard(2600);
		System.out.println(card2.getBalance());
		System.out.println(card2.getCardNo());
		System.out.println(card2.isActive());
	}
}
