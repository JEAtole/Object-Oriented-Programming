package domain;
public class Miya implements Warrior {

    // Warrior2

    private final String weapon = "Archery";
    private final int arrowsLeft;
    private final int noOfKills;

    public Miya(int arrowsLeft, int noOfKills) {
        this.arrowsLeft = arrowsLeft;
        this.noOfKills = noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        return  "Miya is using " + weapon + "! has " + arrowsLeft + " bullets left and killed " + noOfKills;
    }
}
