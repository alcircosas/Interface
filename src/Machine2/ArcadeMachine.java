package Machine2;



public class ArcadeMachine implements Coinable, Dispensable {
    int coins;

    public ArcadeMachine(){
        this.coins=10;
    }
    @Override
    public void dispense() {

    	System.out.println("You inserted: " + coins);
        System.out.println("Ready to play the game!");
        coins++;

    }
    @Override 
    public boolean insertCoin() {

        this.dispense();
        return true;
    }
    @Override
    public void reload(int count) {

    }
}