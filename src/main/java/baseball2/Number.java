package baseball2;

import static java.lang.String.*;

public class Number {
    private final int RANDOM_NUMBER;

    public Number(int RANDOM_NUMBER) {
        this.RANDOM_NUMBER = RANDOM_NUMBER;
    }

    public String[] compareIsNumber(String number) {
        String[] scoreBoard = number.split("");

        for (int i = 0; i < scoreBoard.length; i++) {
            if (isStrike(scoreBoard[i], i)) {
                scoreBoard[i] = "S";
            }
        }

        return scoreBoard;
    }

    private boolean isStrike(String token, int index) {
        return token.equals(valueOf(RANDOM_NUMBER).split("")[index]);
    }

    public String[] isBall(String[] scoreBoard) {

    }

}
