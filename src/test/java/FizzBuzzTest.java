import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private int num;
    private String ans;

    public FizzBuzzTest(int num, String ans) {
        this.num = num;
        this.ans = ans;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParams() {
        return Arrays.asList(new Object[][]{
                {3, "Fizz"},
                {5, "Buzz"},
                {15, "FizzBuzz"},
                {1, "1"}
        });

    }

    @Test
    public void should_return_fizz_buzz_given_number_divisible_by_param() {
        assertThat(FizzBuzzCheck.checkFizzBuzz(num)).isEqualTo(ans);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw_exception_given_num_le_0() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
        FizzBuzzCheck.checkFizzBuzz(-2);
    }


}
