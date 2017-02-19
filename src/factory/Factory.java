package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factory {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number of detailsA");
		int detailsA = Integer.parseInt(reader.readLine());

		System.out.println("Enter percentege of lost goods");
		int lostDeatailsA = Integer.parseInt(reader.readLine());

		System.out.println("Enter price");
		int priceA = Integer.parseInt(reader.readLine());

		System.out.println("Enter a number of detailsB");
		int detailsB = Integer.parseInt(reader.readLine());

		System.out.println("Enter percenteg of lost goodsB");
		int lostpercentDetailsB = Integer.parseInt(reader.readLine());

		System.out.println("Enter price");
		int priceB = Integer.parseInt(reader.readLine());

		int quantityOfLosingA = detailsA * lostDeatailsA / 100;
		System.out.println("amount of lost bolts " + quantityOfLosingA);
		int quantityOfLosingB = detailsB * lostpercentDetailsB / 100;
		System.out.println("amount of lost bolts " + quantityOfLosingB);

		int damagePriceA = quantityOfLosingA * priceA;
		System.out.println("damagePriceA " + damagePriceA);
		int damagePriceB = quantityOfLosingB * priceB;
		System.out.println("damagePriceB " + damagePriceB);

		int actualAmountA = detailsA - quantityOfLosingA;
		System.out.println("actual amount of bolts " + actualAmountA);
		int actualAmountB = detailsB - quantityOfLosingB;
		System.out.println("actual amount of gaiks " + actualAmountB);

		int dagageOfLostGoods;

		if (actualAmountA > actualAmountB) {
			dagageOfLostGoods = (actualAmountA - actualAmountB) * priceA;
		} else {
			dagageOfLostGoods = (actualAmountB - actualAmountA) * priceB;
		}
		System.out.println(dagageOfLostGoods + " ");
		int entireDamage = dagageOfLostGoods + damagePriceA + damagePriceB;

		System.out.println(entireDamage);

	}
}
