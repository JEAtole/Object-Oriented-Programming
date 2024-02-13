package domain;
public class Clint implements Warrior {

    // Warrior1

    private final String weapon = "Guns";
    private final int bulletsLeft;
    private final int noOfKills;

    public Clint(int bulletsLeft, int noOfKills) {
        this.bulletsLeft = bulletsLeft;
        this.noOfKills = noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        return "Clint is using " + weapon + "! has " + bulletsLeft + " bullets left and killed " + noOfKills;
    }
}
