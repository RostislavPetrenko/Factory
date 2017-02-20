package likeaboss;

public class DamageCalculator {
	private ItemInfo boltsInfo;
	private ItemInfo gaiskInfo;

	public DamageCalculator(ItemInfo boltsInfo, ItemInfo gaiskInfo) {
		this.boltsInfo = boltsInfo;
		this.gaiskInfo = gaiskInfo;
	}

	public int getActualDamage() {
		return getDamageFromUnpairedItems() + getDamageFromBolts() + getDamageFromGaisk();
	}

	private int getDamageFromUnpairedItems() {
		int boltsActualAmount = boltsInfo.getActualAmount();
		int gaiskActualAmount = gaiskInfo.getActualAmount();
		int damageFromUnpaired;

		if (boltsActualAmount > gaiskActualAmount) {
			damageFromUnpaired = (boltsActualAmount - gaiskActualAmount) * boltsInfo.pricePerItem;
		} else if (boltsActualAmount == gaiskActualAmount) {
			damageFromUnpaired = 0;
		} else {
			damageFromUnpaired = (gaiskActualAmount - boltsActualAmount) * gaiskInfo.pricePerItem;
		}
		return damageFromUnpaired;
	}

	private int getDamageFromGaisk() {
		return gaiskInfo.getLostAmount() * gaiskInfo.pricePerItem;
	}

	private int getDamageFromBolts() {
		return boltsInfo.getLostAmount() * boltsInfo.pricePerItem;
	}
}
