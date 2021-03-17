package baseball;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.*;

public class Number {

    private final int NUMBER_DIGIT = 3;
    private final int RANDOM_NUMBER;
    private char[] inputNumber;

    public Number(int RANDOM_NUMBER) {
        this.RANDOM_NUMBER = RANDOM_NUMBER;

    }

    private boolean isStrike(int index) {
        return inputNumber[index] == valueOf(RANDOM_NUMBER).charAt(index);
    }

    private boolean isBall(char number) {
        for (int i = 0; i < NUMBER_DIGIT; i++) {
            if (number == valueOf(RANDOM_NUMBER).charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public ScoreBoard inputValueCompare(char[] l_inputNumber) {
        this.inputNumber = l_inputNumber;
        Map<String, Integer> score = getScore();
        for (int i = 0; i < inputNumber.length; i++) {
            if (isStrike(i)) {
                scoreInput(score, "Strike");
                strikeNumberDelete(inputNumber[i]);
            }
        }
        for (char c : inputNumber) {
            if (isBall(c)) {
                scoreInput(score, "Ball");
            }
        }
        return new ScoreBoard(score);
    }


    private void scoreInput(Map<String, Integer> scoreBoard, String key) {
        scoreBoard.put(key, scoreBoard.get(key) + 1);
    }

    private void strikeNumberDelete(char number) {
        for (int i = 0; i < inputNumber.length; i++) {
            if (number == inputNumber[i]) {
                inputNumber[i] = '-';
            }
        }
    }

    private Map<String, Integer> getScore() {
        Map<String, Integer> score = new HashMap<>();
        score.put("Strike", 0);
        score.put("Ball", 0);
        return score;
    }
}