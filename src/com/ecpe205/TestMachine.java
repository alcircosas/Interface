package com.ecpe205;

public class TestMachine {
	public static void main (String [] args) {
		GumballMachine gumballMachine = new GumballMachine ();
		Person person = new Person (7);
		
		person.insertCoin (gumballMachine, 10);
		person.insertCoin (gumballMachine, 15);
		person.insertCoin (gumballMachine, 20);
		person.insertCoin (gumballMachine, 15);
		person.insertCoin (gumballMachine, 20);
		person.insertCoin (gumballMachine, 15);
		person.insertCoin (gumballMachine, 25);
	}

}
