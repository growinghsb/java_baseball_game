package baseball;

import java.util.Arrays;

import static java.lang.String.*;

public class Number {

    private final int NUMBER_DIGIT = 3;
    private final int RANDOM_NUMBER;

    public Number(int RANDOM_NUMBER) {
        this.RANDOM_NUMBER = RANDOM_NUMBER;
    }

    public boolean isStrike(int inputNumber, int index) {
        return valueOf(inputNumber).charAt(index) == valueOf(RANDOM_NUMBER).charAt(index);
    }

    public int isBall(int inputNumber, int index) {
        for (int i = 0; i < NUMBER_DIGIT; i++) {
            if (valueOf(inputNumber).charAt(index) == valueOf(RANDOM_NUMBER).charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
