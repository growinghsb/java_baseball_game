package baseball;

import java.util.Map;

public class ScoreBoard {
    private Map<String, Integer> scoreBoard;

    public ScoreBoard(Map<String, Integer> scoreBoard) {
        this.scoreBoard = scoreBoard;

    }
    public void printScore() {
        StringBuilder scorePrint = new StringBuilder();
        for (String s : scoreBoard.keySet()) {
            scorePrint.append(scoreBoard.get(s)).append(" ").append(s).append(" ");
        }
        System.out.println(scorePrint);
    }

}
