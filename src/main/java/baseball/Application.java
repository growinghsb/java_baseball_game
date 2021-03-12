package baseball;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;
import static utils.RandomUtils.*;

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

        while (finish) {
            char[] randomValue = valueOf(nextInt(99, 999)).toCharArray();
            check(randomValue, inputNumberConversion(inputNumber(scanner)));
        }
    }

    public static Integer inputNumber(Scanner scanner) {
        System.out.println("숫자를 입력해주세요.");
        return scanner.nextInt();
    }

    public static String check(char[] randomValue, char[] inputValue) {

    }

    public static char[] inputNumberConversion(Integer inputValue) {
        return valueOf(inputValue).toCharArray();
    }

    public static boolean endAnswre(Scanner scanner) {
        System.out.println("3개의 숫자를 모두 맞추셨습니다!! 게임종료.\n게임을 새로 시작 1, 종료 2");
        if (scanner.nextInt() == 1) {
            return true;
        }
        return false;
    }
}
