package baseball2;

import utils.RandomUtils;

public class GameController2 {

    private final Input input;
    private final Number number;
    private final Print print;

    private GameController2() {
        this.input = new Input();
        this.number = new Number(RandomUtils.nextInt(99, 999));
        this.print = new Print();
    }

    public static void start() {
        GameController2 controller2 = new GameController2();

    }

    private void play() {

    }
}
