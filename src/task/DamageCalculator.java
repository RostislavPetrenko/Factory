package task;

public class DamageCalculator {
	private ItemInfo screwsInfo;
	private ItemInfo nutsInfo;

	public DamageCalculator(ItemInfo boltsInfo, ItemInfo gaiskInfo) {
		this.screwsInfo = boltsInfo;
		this.nutsInfo = gaiskInfo;
	}

	public int getActualDamage() {
		return getDamageFromUnpairedItems() + getDamageFromScrews() + getDamageFromNuts();
	}
	private int getDamageFromUnpairedItems() {
		int screwsActualAmount = screwsInfo.getActualAmount();
		int nutsActualAmount = nutsInfo.getActualAmount();
		int damageFromUnpaired;

		if (screwsActualAmount > nutsActualAmount) {
			damageFromUnpaired = (screwsActualAmount - nutsActualAmount) * screwsInfo.pricePerItem;
		} else if (screwsActualAmount == nutsActualAmount) {
			damageFromUnpaired = 0;
		} else {
			damageFromUnpaired = (nutsActualAmount - screwsActualAmount) * nutsInfo.pricePerItem;
		}
		return damageFromUnpaired;
	}

	private int getDamageFromNuts() {
		return nutsInfo.getLostAmount() * nutsInfo.pricePerItem;
	}

	private int getDamageFromScrews() {
		return screwsInfo.getLostAmount() * screwsInfo.pricePerItem;
	}
}
