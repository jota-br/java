import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player player) {

        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listMembers() {

        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    public int rankings()  {

        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost ot";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            message = "tied";
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + rankings() + ")";
    }
}
