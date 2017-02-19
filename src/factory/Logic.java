package factory;

public class Logic {
	
	public int getQuantityofLosingGoods(int totalQuantityOfGoods, int lostPercentOfGoods){
		int quiantityOfLostgood = totalQuantityOfGoods*lostPercentOfGoods/100;
		return quiantityOfLostgood;
	}
	
	public int priceOfLosing (int amountOfLostGoods, int priceOfLostGoods){
		int priceOfLosing = amountOfLostGoods * priceOfLostGoods;
		return priceOfLosing;
	}
	
	public int actualAmount(int initialAmountOfgoods, int quantityOfLostGoods){
		int actualAmount = initialAmountOfgoods - quantityOfLostGoods;
		return actualAmount;
	}

	
}
