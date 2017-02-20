package likeaboss;

import java.io.IOException;

public class WarehouseHelper {
	final static String INPUT_FILE = "INPUT.TXT";
	final static String OUTPUT_FILE = "OUTPUT.TXT";

	public static void main(String[] args) throws IOException {
		ItemsInfoReader reader = new ItemsInfoReader(INPUT_FILE);
		ItemInfo boltsInfo = reader.getBoltsInfo();
		ItemInfo gaiskInfo = reader.getGaiskInfo();

		DamageCalculator calculator = new DamageCalculator(boltsInfo, gaiskInfo);
		int actualDamage = calculator.getActualDamage();
		System.out.println();
		FileWriter writer = new FileWriter(OUTPUT_FILE);
		writer.writeIntoOutput(actualDamage);
	}
}
