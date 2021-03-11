import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringCalculator {
    public static void main(String[] args) throws IOException {
        // 이것만 있으면 int만 읽는다
        InputStreamReader inputStream = new InputStreamReader(System.in);

        // 요게 문자열로 읽는다.
        BufferedReader bufferedReader = new BufferedReader(inputStream);

        String str;
        System.out.println("숫자를 입력해주세요.");

        // str = bufferedReader.readLine().trim(); // 입력된 값을 문자열로 읽을 수 있게 변환
        //여기서 입력 받는 것은 의미가 없다. 모든 확인은 테스트를 통해 진행 된다.
        // 문자열을 enter를 기준으로 읽는다  .trim(); 공백 제거
        //.replace(":", ","); // 앞에 매개변수 문자를 뒤 매개변수 문자로 치환

        //System.out.println(calcul(str));

        bufferedReader.close();
        inputStream.close();

    }

    // 문자열 비교는 ==이 아닌 equals비교로. 객체기 떄문.
    // 공백 비교는 isEmpty로. 단 null비교는 안된다. length가 0일때만.
    // 메서드에 값이 입력 됬을 때 공백이 있으면, isEmpty가 잡아내지 못한다.
    // 아무 값 없이 공백만 있는 것은 빈 값이나 마찬가지기 때문에 공백 제거 후 Empty체크를 한다.
    // 해서 공백을 제거 한 후 진행하고자 trim()으로 공백을 제거한다.

     /* if (str.contains(",")) { // 문자열안에 매개변수로 넘겨준 문자가 들었는지 확인.
            tmp = str.split(",|:"); // 매개변수 문자를 기준으로 문자열을 잘라 String 배열로 만들어준다.
            // 몰랐는데 split 메서드 매개변수로 여러 문자를 한 번에 넘기는게 가능하다. 전부 체크한다.

        }
        for (String s : tmp) { // iterator 향상된 for문
            System.out.println(s);
        }*/

    /**
     * 리팩토링 (메서드 나누기)
     * 1. 들여쓰기가 두 군데 되어 있는 곳을 개선하기
     * 2. else 예약어 사용하지 않기, 어떤 값이 들어오는지 예상할 수 없다.
     * 3. 메서드는 한 가지 일만 하기.
     * 4. 로컬 변수는 꼭 필요한가?
     * 5. compose method 패턴 적용, 메서드의 의도가 잘 들어나도록
     * 동등한 수준의 작업을 하는 여러 단계로 나눈다. (궂이 public을 할 이유가 없으면 private으로 하자.)
     * 6. 모든 원칙을 한 번에 적용하려 하지 마라.
     * 한 번에 하나씩 적용시켜나가라.
     */
    /*public static int calcul(String str) {

        int result = 0;
        if (str.equals("null") || str.trim().isEmpty()) {
            return result;
        } else { 2. else 쓰지 않기
            String[] tmp = str.split(",|:");
            for (String s : tmp) {
                result += Integer.parseInt(s); 1. 이 부분이 2번 들여쓰기가 되어 있다.
            }
            return result;
        }


    }*/
    public static int calcul(String str) {
        if (isBlank(str)) {
            return 0;
        }

        return sum(split(str));
    }

    public static boolean isBlank(String str) { // 입력된 값을 비교만 한다.
        if (str.equals("null") || str.trim().isEmpty()) return true;
        return false;
    }

    private static String[] split(String str) { // 문자열 자르는 메서드, 자르기만 한다.
        return str.split(",|:");
    }

    private static int sum(String[] strr) { // 계산만 한다.
        int sum = 0;
        for (String s : strr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

}
