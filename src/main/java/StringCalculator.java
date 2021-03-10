import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static int calcul(String str) {

        int result = 0;

        // 문자열 비교는 ==이 아닌 equals비교로. 객체기 떄문.
        // 공백 비교는 isEmpty로. 단 null비교는 안된다. length가 0일때만.
        // 메서드에 값이 입력 됬을 때 공백이 있으면, isEmpty가 잡아내지 못한다.
        // 아무 값 없이 공백만 있는 것은 빈 값이나 마찬가지기 때문에 공백 제거 후 Empty체크를 한다.
        // 해서 공백을 제거 한 후 진행하고자 trim()으로 공백을 제거한다.
        if (str.equals("null") || str.trim().isEmpty()) {
            return result;
        } else {
            String[] tmp = str.split(",|:");
            for (String s : tmp) {
                result += Integer.parseInt(s);
            }
            return result;
        }

       /* if (str.contains(",")) { // 문자열안에 매개변수로 넘겨준 문자가 들었는지 확인.
            tmp = str.split(",|:"); // 매개변수 문자를 기준으로 문자열을 잘라 String 배열로 만들어준다.
            // 몰랐는데 split 메서드 매개변수로 여러 문자를 한 번에 넘기는게 가능하다. 전부 체크한다.

        }
        for (String s : tmp) { // iterator 향상된 for문
            System.out.println(s);
        }*/
    }
}
