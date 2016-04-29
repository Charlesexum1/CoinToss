/*
 * CoinToss.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 */
import java.util.Random;

public class CoinToss {
	
	private static String outcome;
	private static double coin = Math.random();
	public void theToss(){
		if ((coin > 0) && (coin <= 0.50)){
			outcome = "heads!";
		}
		else {
			outcome = "tails!";
			}
	}
	
	public void averageTosses(int x){
		
		int heads = 0;
		int tails = 0;
		int total = 0;
		
		for (int q = 1; q <= x; q++){
			double shinyCoin = Math.random();
			if (shinyCoin <= .5){
				heads++;
				total++;
				}
			else{
				tails++;
				total++;
				}	
			}
			System.out.println("Total heads: " + heads);
			System.out.println("Total tails: " + tails);
			System.out.println();
			System.out.println("Percent heads: " + ((heads / total) * 100));
			System.out.println("Percent tails: " + ((tails / total) * 100));
		}
	
	public static void main (String args[]) {
		
		CoinToss demo = new CoinToss();
		demo.averageTosses(6);
		
		
	}
}

