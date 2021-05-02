package Machine2;

public class Person {
	   private int coins;

	   public Person(int coins){
	       this.coins=coins;
	   }
	   public void insertCoin(Coinable coinable){
	       System.out.println("Your Coin Balance is "+coins);
	       if(!coinable.insertCoin());
	       coins--;
	       
	       if (coins==0)
	    	   System.out.println ("You have no coins left!");
	   }
	}