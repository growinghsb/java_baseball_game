import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


/**
 * 테스트 단위는 최대한 잘게 쪼갤 것. 메서드를 아끼지 마라.
 * 메서드를 쪼개야 어떤 테스트를 했는지 알 수 있다. 표시된다.
 * 기능을 구현 했으면 컴파일 하지 말고 테스트 코드 작성 후 테스트를 돌려라.
 * 테스트의 작성은 최대한 안되게, 꼼꼼히 작성 해야 한다.
 * "잘 되네" 하고 넘어가는게 목적이 아니다.
 *
 * 이렇게 테스트를 해 보니 메서드는 하나의 역할만을 담당해야 한다. 잘게 쪼개야 한다.
 * 테스트 하기 좋게 만들어야 한다. 단순하고 명확하게. 그래야 좋은 코드다.
 * 일단 만들어라(쉬운 것 부터터, 테스트 하라, 잘 돌아가면 리팩토링(테스트는 그대로, 기능 메서드만) 하라.
 * 메서드를 분리해 역할을 나누고, 목적을 분명히 하라.
 *
 * 기준 : 한 단계 들여쓰기만 허용, else 예약어 사용 안하기, 메서드는 한 가지 역할만, 로컬변수는 필요한가?
 * compost method 패턴 적용. 읽기 좋은 코드인가? 중복은 제거 했는가?
 *
 * 이러한 기준을 한 번에 다 지키려고 하지 말고
 * 한 번에 하나씩 명확하고 구체적인 목표를 가지고 연습하라.
 */
public class TddPractice {
    StringCalculator calculator = new StringCalculator();

    @Test
    public void 스플릿_테스트() {

        //given
        String[] values = "1,2,3,4".split(",");

        //when
        //than
        assertThat(values).startsWith("1");
        assertThat(values).endsWith("4");
        assertThat(values).contains("3");
        assertThat(values).hasSize(4);
        assertThat(values).isNotEmpty();
    }

    @Test
    public void 컬랙션_테스트() {
        //given
        List<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");

        //when
        //than
        assertThat(arr.add("fourth")).isTrue();
        assertThat(arr.get(0)).isEqualTo("first");
        assertThat(arr.size()).isNotEqualTo(3);
        assertThat(arr.contains("first")).isTrue();
        assertThat(arr.remove(0)).isEqualTo("first");
    }

    @Test
    public void 문자열_계산기_null() {
        //given
        int result = StringCalculator.calcul("null");

        //when
        //than
        assertThat(result).isZero(); // 0이고
        assertThat(result).isEqualTo(0); // 0과 같으며
        assertThat(result).isNotNull(); // null은 아니다.


    }

    @Test
    public void 문자열_계산기_빈_값() {
        //given
        int result = StringCalculator.calcul("   ");
        int result2 = StringCalculator.calcul("");

        //when
        //than
        assertThat(result).isEqualTo(0); // 0과 같아야 하고
        assertThat(result).isNotNull(); // 널은 아니어야 하며
        assertThat(result).isZero(); // 0이어야 한다.

        assertThat(result2).isEqualTo(0);
        assertThat(result2).isNotNull();
        assertThat(result2).isZero();


    }

    @Test
    public void 문자열_계산기_값_하나() {
        //given
        int result = StringCalculator.calcul("4");

        //when
        //than
        assertThat(result).isEqualTo(4); // 문자열 하나만 넣었기에 4여야 하고
        assertThat(result).isNotZero(); // 0은 아니어야 한다.


    }

    @Test
    public void 문자열_계산기_값_두개() {
        //given
        int result = StringCalculator.calcul("4,6");

        //when
        //than
        assertThat(result).isEqualTo(10); // 문자열 두 개를 넣었기에 더해서 10이여야 하고
        assertThat(result).isNotZero(); // 0은 아니어야 한다.

    }

    @Test
    public void 문자열_계산기_구분자_섞어서() {
        //given
        int result = StringCalculator.calcul("4,6:4:8");

        //when
        //than
        assertThat(result).isEqualTo(22); // 전부 더해서 나와야 하며, 22여야 한다.
        assertThat(result).isNotZero(); // 0은 아니어야 한다.


    }
}
