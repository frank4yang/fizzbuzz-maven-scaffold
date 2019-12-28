import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void check_fizz_test(){
        assertThat(FizzBuzzCheck.checkFizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void check_buzz_test(){
        assertThat(FizzBuzzCheck.checkFizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    public void check_number_test(){
        assertThat(FizzBuzzCheck.checkFizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void should_return_fizz_buzz_given_number_divisible_by_15(){
        //given,测试数据,ctrl+n,refactor ,extract ,变量
        int i = 15;
        //when  alt+enter,ctrl+shift+enter(自动补全)
        String result = FizzBuzzCheck.checkFizzBuzz(i);
        //then  断言（assertThat）
        assertThat(result).isEqualTo("FizzBuzz");
    }

}
