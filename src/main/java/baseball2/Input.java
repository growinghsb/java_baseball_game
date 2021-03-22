package baseball2;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String inputNumber() {
        System.out.println();
        System.out.println("숫자를 입력하세요!");
        return scanner.nextLine();
    }
}
