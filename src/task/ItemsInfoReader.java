package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ItemsInfoReader {

	private ItemInfo screws;
	private ItemInfo nuts;

	public ItemsInfoReader(String inputFile) throws IOException {
		readFile(inputFile);
	}

	private void readFile(String inputFile) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(inputFile));
		int totalAmountScrews, percentageOfLossScrews,pricePerItemScrews;
		totalAmountScrews = scan.nextInt();
		percentageOfLossScrews = scan.nextInt();
		pricePerItemScrews = scan.nextInt();
		screws = new ItemInfo(totalAmountScrews, percentageOfLossScrews, pricePerItemScrews);

		int totalAmountNuts, percentageOfLossNuts, pricePerItemNuts;
		totalAmountNuts = scan.nextInt();
		percentageOfLossNuts = scan.nextInt();
		pricePerItemNuts = scan.nextInt();
		nuts = new ItemInfo(totalAmountNuts, percentageOfLossNuts, pricePerItemNuts);
		scan.close();
	}

	public ItemInfo getScrewsInfo() {
		return screws;
	}

	public ItemInfo getNutskInfo() {
		return nuts;
	}
}
