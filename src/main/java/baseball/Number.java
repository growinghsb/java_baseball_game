package baseball;

import java.util.Arrays;

public class Number {

    private final int RANDOM_NUMBER;
    private int inputNumber;

    public Number(int RANDOM_NUMBER) {
        this.RANDOM_NUMBER = RANDOM_NUMBER;
    }

    public boolean isStrike(int inputNumber, int index) {
        return String.valueOf(inputNumber).charAt(index) == String.valueOf(RANDOM_NUMBER).charAt(index);
    }
}
