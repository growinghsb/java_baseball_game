package baseball;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Input {

    final Scanner scanner = new Scanner(System.in);

    private int inputValue() {
        System.out.println("숫자를 입력해주세요!");
        return scanner.nextInt();
    }

    private char[] inputValueConvert(int inputValue) {
        return valueOf(inputValue).toCharArray();
    }

    public char[] inputValueCreate() {
        return inputValueConvert(inputValue());
    }

}
