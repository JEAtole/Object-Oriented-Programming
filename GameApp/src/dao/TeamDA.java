package dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import domain.*;
public class TeamDA {
    public TeamDA() throws FileNotFoundException {

        Scanner teamInfo = new Scanner(
                new FileReader("./src/teamInfo.csv"));

        ArrayList<Team> teamList = new ArrayList<>();

        while (teamInfo.hasNext()) {

            String[] rowTeamInfo = teamInfo.nextLine().split(",");

            Team team = new Team(rowTeamInfo[0].trim(), rowTeamInfo[1].trim());

            WarriorDA warriorDA = new WarriorDA(team.getTeamID());
            team.setWarriorList(warriorDA.getWarriorList());
            team.setTotalKills(warriorDA.getKillCount());

            teamList.add(team);
        }

        teamInfo.close();

        StringBuilder report = new StringBuilder();
        report.append("\nTeam Standing Report\n");

        for (Team teams : teamList) {
            report.append("\n<-------------------------------------------------------->\n");
            report.append(teams);
        }

        System.out.println(report);
    }
}