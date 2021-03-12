package baseball;

import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.RandomUtils.*;

class ApplicationTest {

    @Test
    public void 랜덤값_출력_테스트() {
        //given
        //when
        int randomValue = nextInt(100, 999);
        //than
        assertThat(randomValue).isNotZero();
        assertThat(randomValue).isLessThanOrEqualTo(999);
        assertThat(randomValue).isGreaterThanOrEqualTo(100);

    }

    @Test
    public void 숫자_변환_테스트() {
        //given
        //when
        char[] conversion = Application.inputNumberConversion(100);
        //than
        assertThat(conversion).isNotNull();
        assertThat(conversion).isNotEmpty();
        assertThat(conversion.length).isNotZero();
        assertThat(conversion.length).isEqualTo(3);

    }
}