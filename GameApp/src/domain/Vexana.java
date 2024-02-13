package domain;
public class Vexana implements Warrior {

    // Warrior3

    private final String weapon = "Bombs";
    private final int bombsLeft;
    private final int noOfKills;

    public Vexana(int bombsLeft, int noOfKills) {
        this.bombsLeft = bombsLeft;
        this.noOfKills = noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        return "Vexana is using " + weapon + "! has " + bombsLeft + " bullets left and killed " + noOfKills;
    }
}
