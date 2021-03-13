package baseball;

import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static baseball.Application.*;
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
         List<String> conversion = inputNumberConversion(100);
        //than
        assertThat(conversion).isNotNull();
        assertThat(conversion).isNotEmpty();
        assertThat(conversion.size()).isNotZero();
        assertThat(conversion.size()).isEqualTo(3);

    }
    
  /* @Test
   public void 맵_키_체크_테스트() {
       //given
       Map<String, Integer> map1 = new HashMap<>();
       Map<String, Integer> map2 = new HashMap<>();

       //when
       keyCheck(map1, "test");

       keyCheck(map2, "test");
       keyCheck(map2, "test");

       //than
       assertThat(map1).isNotEmpty();
       assertThat(map1.size()).isEqualTo(1);
       assertThat(map1.containsKey("test")).isTrue();
       assertThat(map1.get("test")).isEqualTo(1);

       assertThat(map2.get("test")).isEqualTo(2);

   }*/
}