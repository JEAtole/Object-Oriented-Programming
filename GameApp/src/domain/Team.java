package domain;
import java.util.ArrayList;
public class Team {
    private final String teamID;
    private final String teamName;
    private int totalKills;
    private ArrayList<String> warriorList;

    public Team(String teamID, String teamName) {
        this.teamID = teamID;
        this.teamName = teamName;
    }

    public String toString(){

        String teamOutput = "";
        teamOutput += "\nTeam ID: " + teamID + "\n" +
                      "Team Name: " +teamName + "\n" +
                      "Total Kill: " + totalKills + "\n";

        StringBuilder teamOutputBuilder = new StringBuilder(teamOutput);
        for(String warrior: warriorList) {
            teamOutputBuilder.append(warrior).append("\n");
        }
        teamOutput = teamOutputBuilder.toString();

        return teamOutput;

    }

    public String getTeamID() {
        return teamID;
    }

    public void setTotalKills(int killCount) {
        this.totalKills = killCount;
    }
    public void setWarriorList(ArrayList<String> warriorList) {
        this.warriorList = warriorList;
    }

}
