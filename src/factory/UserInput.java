package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	
	public int amountOfBolts;
	public int amoutOfGaiks;
	public int percentegeOfLostBolts;
	public int percentegeOfLostGaiks;
	public int pricePerOneBolt;
	public int pricePerOneGaik;
	
	public int getUserInput()throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(reader.readLine());
		return x;
	}
	
	
}
