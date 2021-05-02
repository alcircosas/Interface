package com.ecpe205;

public class Person {
	private int coins, price;
	
	public Person (int coins) {
		this.coins = coins;
		this.price = 10;
	}
	//person inserting coin to machine
	public void insertCoin (Coinable coinable, int coins) {
		//inserted 1 coin
		System.out.println ("Coin Inserted: " + coins);
		if (coins > 2) {
			if (!coinable.insertCoin()) {
			// coins returned
			System.out.println ("Coins refunded");
		}
		else {
			coins = coins - price;
			System.out.println ("Your change is:" + coins);
		}
			
	}
		else {
			System.out.println ("You do not have enough coins!");
			System.out.println (coins + " coins refunded");
		}
	}
}

		
