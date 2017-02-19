package likeaboss;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemsInfoReader {

	private Scanner scan;
	private ArrayList<Integer> list;
	private ItemInfo bolts;
	private ItemInfo gaiks;

	public ItemsInfoReader(String inputFile) throws IOException {
		list = new ArrayList<Integer>();
		scan = new Scanner(new File(inputFile));
		while (scan.hasNext()) {
			list.add(scan.nextInt());
		}
		bolts = new ItemInfo(list.get(0), list.get(1), list.get(2));
		gaiks = new ItemInfo(list.get(3), list.get(4), list.get(5));
	}

	public ItemInfo getBoltsInfo() {
		return bolts;
	}

	public ItemInfo getGaiskInfo() {
		return gaiks;
	}
}
