package baseball;

import utils.RandomUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.String.*;
import static utils.RandomUtils.*;

public class Play {

    private Scanner scanner;
    private Number number;
    private Map<String, Integer> scoreBoard = new HashMap<>();

    public Play(Scanner scanner) {
        this.scanner = scanner;
        number = new Number(nextInt(99, 999));
    }

    public void start() {
        inputValueConvert(inputValue());
    }

    public int inputValue() {
        return scanner.nextInt();
    }

    public String[] inputValueConvert(int inputValue) {
        return valueOf(inputValue).split("");
    }

    public Map<String, Integer> compare(String[] inputValue) {

    }

}
