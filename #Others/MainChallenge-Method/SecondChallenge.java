
public class SecondChallenge {

    public static void main(String[] args) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Elton", calculateHighScorePosition(1000));
        displayHighScorePosition("Carl", calculateHighScorePosition(500));
        displayHighScorePosition("Johnson", calculateHighScorePosition(100));
        displayHighScorePosition("Mikael", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerRank) {

        System.out.println(playerName + " managed to get into position " + playerRank + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        
        return 4;
    }
}
