package baseball;

import java.util.Arrays;

import static java.lang.String.*;

public class Number {

    private final int DIGIT = 3;
    private final int RANDOM_NUMBER;

    public Number(int RANDOM_NUMBER) {
        this.RANDOM_NUMBER = RANDOM_NUMBER;
    }

    public boolean isStrike(int inputNumber, int index) {
        return valueOf(inputNumber).charAt(index) == valueOf(RANDOM_NUMBER).charAt(index);
    }

    public int isBall(int inputNumber, int index) {
        int count = 0;
        for (int i = 0; i < DIGIT; i++) {
            if (valueOf(inputNumber).charAt(index) == valueOf(RANDOM_NUMBER).charAt(i)) {
                count++;
            }
        }
        return count;
    }

}
