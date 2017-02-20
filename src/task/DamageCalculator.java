package task;

public class DamageCalculator {
	private ItemInfo screwsInfo;
	private ItemInfo nutskInfo;

	public DamageCalculator(ItemInfo boltsInfo, ItemInfo gaiskInfo) {
		this.screwsInfo = boltsInfo;
		this.nutskInfo = gaiskInfo;
	}

	public int getActualDamage() {
		return getDamageFromUnpairedItems() + getDamageFromScrews() + getDamageFromNuts();
	}
	private int getDamageFromUnpairedItems() {
		int screwsActualAmount = screwsInfo.getActualAmount();
		int nutsActualAmount = nutskInfo.getActualAmount();
		int damageFromUnpaired;

		if (screwsActualAmount > nutsActualAmount) {
			damageFromUnpaired = (screwsActualAmount - nutsActualAmount) * screwsInfo.pricePerItem;
		} else if (screwsActualAmount == nutsActualAmount) {
			damageFromUnpaired = 0;
		} else {
			damageFromUnpaired = (nutsActualAmount - screwsActualAmount) * nutskInfo.pricePerItem;
		}
		return damageFromUnpaired;
	}

	private int getDamageFromNuts() {
		return nutskInfo.getLostAmount() * nutskInfo.pricePerItem;
	}

	private int getDamageFromScrews() {
		return screwsInfo.getLostAmount() * screwsInfo.pricePerItem;
	}
}
