package oopEffort;

import java.io.IOException;

public class Tester {
	public static void main(String[] args) throws IOException {
		
		OOPFactory factory = new OOPFactory();
		
		System.out.println(factory.getQuantityofLosingBolts());
		System.out.println(factory.getQuantityofLosingGaiks());
		System.out.println();
		
		
		System.out.println(factory.getPriceOfLosingBolts());
		System.out.println(factory.getPriceOfLosingGaiks());
		System.out.println();
		System.out.println(factory.getActualAmountBolts());
		System.out.println(factory.getActualAmountGsiks());
		
		System.out.println(factory.compare());
		System.out.println(factory.getEntireDamage());
		
	}

}
