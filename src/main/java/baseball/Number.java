package baseball;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class Number {

    private final int NUMBER_DIGIT = 3;
    private final int RANDOM_NUMBER;
    private char[] inputNumber;

    public Number(int RANDOM_NUMBER) {
        this.RANDOM_NUMBER = RANDOM_NUMBER;

    }

    public ScoreBoard inputValueCompare(char[] l_inputNumber) {
        this.inputNumber = l_inputNumber;
        Map<String, Integer> score = new HashMap<>();
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

    private Integer scoreInput(Map<String, Integer> scoreBoard, String key) {
        if (scoreBoard.containsKey(key)) {
            return scoreBoard.put(key, scoreBoard.get(key) + 1);
        }

        return scoreBoard.put(key, 1);
    }

    private void strikeNumberDelete(char number) {
        for (int i = 0; i < inputNumber.length; i++) {
            if (number == inputNumber[i]) {
                inputNumber[i] = '-';
            }
        }
    }
}