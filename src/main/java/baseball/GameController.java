package baseball;

import utils.RandomUtils;

import static utils.RandomUtils.*;

public class GameController {

    private Input input;
    private Number number;
    private ScoreBoard scoreBoard;

    public GameController(Input input) {
        this.input = input;
    }

    public void start() {
        do {
            number = new Number(nextInt(99, 999));
        } while (play());
    }

    public boolean play() {
        do {
            scoreBoard = number.inputValueCompare(input.inputValueCreate());
        } while (scoreBoard.printScore());

        return scoreBoard.finishQuestion();
    }
}