

public class TestCard {
	public static void main(String[] args) {
		TravelCard card = new TravelCard();
		card.CardNo=2345;
		card.swipeLimit=50;
		card.availableBalance=10000;
		card.rechargeCard(3000);
		card.swipeCard(200);
		System.out.println(card.toString());
		System.out.println(card.returnRewardPoints(200));
	}
}
