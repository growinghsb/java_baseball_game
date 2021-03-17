package baseball;

import utils.RandomUtils;

import static utils.RandomUtils.*;

public class GameController {

    private Input input;
    private Number number;

    public GameController(Input input) {
        this.input = input;
    }

    public void start() {
        number = new Number(nextInt(99, 999));
        number.inputValueCompare(input.inputValueCreate());
    }
}