package com.ecpe205;

public class GumballMachine implements Coinable, Dispensable{
	
	int gums=0;
	
	public GumballMachine () {
		this.gums = 5;
	}
	public void dispense () {
	this.gums--;
	System.out.println ("1 Gum dispensed.");
	System.out.println ("Gums remaining: " + gums);
}
	public void reload (int count) {
		//this.gums++;
		this.gums += count;
	}
	public boolean insertCoin() {
		//processing of coins
		if (this.gums > 0) {
			this.dispense();
			// return true if dispense is valid
			return true;
		}
		System.out.println ("Gumball is Empty!");
		return false;
	}
}