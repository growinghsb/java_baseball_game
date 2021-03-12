package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void 랜덤값_출력_테스트() {
        //given
        int randomValue = RandomUtils.nextInt(100, 999);

        //when


        //than
        assertThat(randomValue).isNotZero();
        assertThat(randomValue).isLessThanOrEqualTo(999);
        assertThat(randomValue).isGreaterThanOrEqualTo(100);

    }
}