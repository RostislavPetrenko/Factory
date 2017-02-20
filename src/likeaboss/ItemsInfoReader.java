package likeaboss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemsInfoReader {

	private ItemInfo bolts;
	private ItemInfo gaiks;

	public ItemsInfoReader(String inputFile) throws IOException {
		readFile(inputFile);
	}

	private void readFile(String inputFile) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(inputFile));
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (scan.hasNext()) {
			list.add(scan.nextInt());
		}

		int totalAmountB = list.get(0);
		int percentageOfLossB = list.get(1);
		int pricePerItemB = list.get(2);
		int totalAmountG = list.get(3);
		int percentageOfLossG = list.get(4);
		int pricePerItemG = list.get(5);

		bolts = new ItemInfo(totalAmountB, percentageOfLossB, pricePerItemB);
		gaiks = new ItemInfo(totalAmountG, percentageOfLossG, pricePerItemG);
		scan.close();
	}

	public ItemInfo getBoltsInfo() {
		return bolts;
	}

	public ItemInfo getGaiskInfo() {
		return gaiks;
	}
}
