package dao;
import domain.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class WarriorDA {
    private final ArrayList<String> warriorList;
    private int killCount;
    public WarriorDA(String teamID) throws FileNotFoundException {

        Scanner teamStatInfo = new Scanner(
                new FileReader("./src/teamStatInfo.csv"));

        warriorList = new ArrayList<>();
        killCount = 0;

        while (teamStatInfo.hasNext()) {

            String[] rowTeamStat = teamStatInfo.nextLine().split(",");

            if (teamID.equalsIgnoreCase(rowTeamStat[0])) {

                Warrior wr;
                switch (rowTeamStat[1]) {
                    case "warrior1" -> wr = new Clint(Integer.parseInt(rowTeamStat[2].trim()),
                            Integer.parseInt(rowTeamStat[3].trim()));
                    case "warrior2" -> wr = new Miya(Integer.parseInt(rowTeamStat[2].trim()),
                            Integer.parseInt(rowTeamStat[3].trim()));
                    case "warrior3" -> wr = new Vexana(Integer.parseInt(rowTeamStat[2].trim()),
                            Integer.parseInt(rowTeamStat[3].trim()));
                    default -> throw new IllegalStateException("Invalid Warrior: " + rowTeamStat[1]);
                }

                killCount += Integer.parseInt(rowTeamStat[3].trim());
                warriorList.add(wr.showWarriorAndKills());

            }
        }

        teamStatInfo.close();
    }

    public ArrayList<String> getWarriorList() {
        return warriorList;
    }

    public int getKillCount() {
        return killCount;
    }
}
