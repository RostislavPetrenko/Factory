package oopEffort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOPFactory {

	private int amountOfBolts;
	private int amountOfGaiks;
	private int percentegeOfLostBolts;
	private int percentegeOfLostGaiks;
	private int pricePerOneBolt;
	private int pricePerOneGaik;

	int actualAmountOfGaiks;
	int actualAmountOfBolts;
	int priceOfLosing;
	int quiantityOfLostBolts;
	int quantityOfLostGaiks;
	int priceOfLostGaiks;
	int priceOfLostBolts;
	int damageOfLostGoods;
	int entireDamage;

	public OOPFactory() throws IOException {

		System.out.println("Enter a number of bolts");
		amountOfBolts = getUserInput();
		System.out.println("Enter a number of gaiks");
		amountOfGaiks = getUserInput();
		System.out.println("Enter % of lost bolts");
		percentegeOfLostBolts = getUserInput();
		System.out.println("Enter % of lost gaiks");
		percentegeOfLostGaiks = getUserInput();
		System.out.println("Enter price per bolt");
		pricePerOneBolt = getUserInput();
		System.out.println("Enter price per gaik");
		pricePerOneGaik = getUserInput();
	}

	private int getUserInput() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int data = Integer.parseInt(reader.readLine());
		return data;
	}

	public int getQuantityofLosingBolts() {
		quiantityOfLostBolts = this.amountOfBolts * this.percentegeOfLostBolts / 100;
		return quiantityOfLostBolts;
	}

	public int getQuantityofLosingGaiks() {
		quantityOfLostGaiks = this.amountOfGaiks * this.percentegeOfLostGaiks / 100;
		return quantityOfLostGaiks;
	}

	public int getPriceOfLosingBolts() {
		priceOfLostBolts = getQuantityofLosingBolts() * pricePerOneBolt;
		return priceOfLostBolts;
	}

	public int getPriceOfLosingGaiks() {
		priceOfLostGaiks = this.quantityOfLostGaiks * this.pricePerOneGaik;
		return priceOfLostGaiks;
	}

	public int getActualAmountGsiks() {
		actualAmountOfGaiks = amountOfGaiks - quantityOfLostGaiks;
		return actualAmountOfGaiks;
	}

	public int getActualAmountBolts() {
		actualAmountOfBolts = amountOfBolts - quiantityOfLostBolts;
		return actualAmountOfBolts;
	}

	public int compare() {
		if (actualAmountOfBolts > actualAmountOfGaiks) {
			damageOfLostGoods = (actualAmountOfBolts - actualAmountOfGaiks) * pricePerOneBolt;
			return damageOfLostGoods;
		
		} else {
			damageOfLostGoods = (actualAmountOfGaiks - actualAmountOfBolts)*pricePerOneGaik;
			return damageOfLostGoods;
		}
	}
	
	public int getEntireDamage(){
		entireDamage = damageOfLostGoods + priceOfLostBolts + priceOfLostGaiks;
		return entireDamage;
	}

}
