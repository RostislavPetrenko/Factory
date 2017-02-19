package likeaboss;

public class ItemInfo {
	public int totalAmount;
	public int percentageOfLoss;
	public int pricePerItem;
	private int actualAmount;
	private int lostAmount;
	
	public ItemInfo(int totalAmount, int percentageOfLoss, int pricePerItem){
		this.totalAmount = totalAmount;
		this.percentageOfLoss = percentageOfLoss;
		this.pricePerItem = pricePerItem;
		this.lostAmount= this.totalAmount * this.percentageOfLoss / 100;
		this.actualAmount = this.totalAmount - this.lostAmount;
	}
	
	public int getActualAmount() {
		return actualAmount;		
	}
	
	public int getLostAmount() {
		return lostAmount;
	}
}