package baseball;

import java.util.*;

import static java.util.Arrays.*;
import static utils.RandomUtils.nextInt;

/**
 * 구현 순서
 * 1. 랜덤값 출력하기 - 테스트
 * 2. player 입력 구현
 * 3. 힌트 출력 구현 - 테스트
 * 3-1. strike 체크 구현
 * 3-2. ball 체크 구현
 * 3-3. 낫싱 체크 구현
 * 4. 3자리 모두 맞았을 때 홈런~ 게임 종료 구현 - 테스트
 * 5. 게임 종료 후 다시 시작하거나 종료 하거나 선택 구현 - 테스트
 * 6. 점진적 리팩토링 진행
 */

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        boolean finish = true;
        List<String> randomValueCopy = new ArrayList<>();
        List<String> inputNumber;
        while (finish) {
            List<String> randomValue = inputNumberConversion(nextInt(99, 999));

            do {
                randomValueCopy.clear();
                randomValueCopy.addAll(randomValue);
                inputNumber = inputNumberConversion(numberInput(scanner));
                isStrike(randomValueCopy, inputNumber);
                isBall(randomValueCopy, inputNumber);
            } while (printResult(scoreCheck(inputNumber)));

            finish = finishQuestion(scanner);
        }
    }

    public static void isStrike(List<String> randomValueCopy, List<String> inputValue) {
        for (int i = 0; i < randomValueCopy.size(); i++) {
            if (randomValueCopy.get(i).equals(inputValue.get(i))) {
                randomValueCopy.set(i, "S");
                inputValue.set(i, "S");
            }
        }
    }

    public static void isBall(List<String> randomValueCopy, List<String> inputValue) {
        for (int i = 0; i < randomValueCopy.size(); i++) {
            if (numberCompare(randomValueCopy.get(i), inputValue)) {
                randomValueCopy.set(i, "B");
            }
        }
    }

    public static boolean numberCompare(String randomValue, List<String> inputValue) {
        for (int j = 0; j < inputValue.size(); j++) {
            if (randomValue.equals(inputValue.get(j)) && !randomValue.equals("S")) {
                inputValue.set(j, "B");
                return true;
            }
        }
        return false;
    }

    public static Map<String, Integer> scoreCheck(List<String> score) {
        Map<String, Integer> scoreBoard = new HashMap<>();
        scoreBoard.put("Strike", 0);
        scoreBoard.put("Ball", 0);
        for (String s : score) {
            if (s.equals("S")) {
                scoreBoard.put("Strike", scoreBoard.get("Strike") + 1);
            }
            if (s.equals("B")) {
                scoreBoard.put("Ball", scoreBoard.get("Ball") + 1);
            }
        }
        return scoreBoard;
    }

    public static boolean printResult(Map<String, Integer> scoreBoard) {
        if (scoreBoard.get("Strike") == 0 && scoreBoard.get("Ball") == 0) {
            System.out.println("Nothing");
            return true;
        }
        if (scoreBoard.get("Ball") == 0 && scoreBoard.get("Strike") != 3) {
            System.out.println(scoreBoard.get("Strike") + " 스트라이크!");
            return true;
        }
        if (scoreBoard.get("Strike") == 0) {
            System.out.println(scoreBoard.get("Ball") + " 볼!");
            return true;
        }
        if (scoreBoard.get("Strike") != 0 && scoreBoard.get("Ball") != 0) {
            System.out.println(scoreBoard.get("Strike") + " 스트라이크! " + scoreBoard.get("Ball") + " 볼!");
            return true;
        }

        return false;
    }

    public static Integer numberInput(Scanner scanner) {
        System.out.println();
        System.out.println("숫자를 입력해주세요.");
        return scanner.nextInt();
    }


    public static List<String> inputNumberConversion(Integer inputValue) {
        return new ArrayList<>(asList(inputValue.toString().split("")));
    }

    public static boolean finishQuestion(Scanner scanner) {
        System.out.println("3개의 숫자를 모두 맞추셨습니다!! 게임종료.\n게임을 새로 시작 1, 종료 2");
        if (scanner.nextInt() == 1) {
            return true;
        }
        return false;
    }
}
