package baseball;

import java.util.Map;
import java.util.Scanner;

public class ScoreBoard {
    private Scanner scanner = new Scanner(System.in);
    private Map<String, Integer> scoreBoard;
    private final int HOME_RUN = 3;

    public ScoreBoard(Map<String, Integer> scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public boolean printScore() {
        if (scoreBoard.isEmpty()) {
            System.out.println("nothing");
            return true;
        }
        StringBuilder scorePrint = new StringBuilder();
        for (String s : scoreBoard.keySet()) {
            scorePrint.append(scoreBoard.get(s)).append(" ").append(s).append(" ");
        }
        if (scoreBoard.containsKey("Strike") && scoreBoard.get("Strike") == HOME_RUN) {
            System.out.println("HOME_RUN!");
            return false;
        }
        System.out.println(scorePrint);
        return true;
    }

    public boolean finishQuestion() {
        System.out.println("게임이 종료 되었습니다\n다시 하기 1번, 종료 하기 2번");
        if (scanner.nextLine().equals("1")) {
            return true;
        }
        return false;
    }
}