package Machine2;

public class TestMachine {
    public static void main(String[] args) {
        ArcadeMachine arcadeMachine = new ArcadeMachine();
        Person person = new Person(5);

        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);


    }
}