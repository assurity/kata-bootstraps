import org.hamcrest.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void firstRecordIsOne(){
        assertThat(getFizzBuzz(1), is(equalTo("1")));
    }

    @Test
    public void secondRecordIsTwo(){
        assertThat(getFizzBuzz(2), is(equalTo("2")));
    }

    @Test
    public void thirdRecordIsFizz(){
        assertThat(getFizzBuzz(3), is(equalTo("Fizz")));
    }

    @Test
    public void fourthRecordIsFour() {
        assertThat(getFizzBuzz(4), is(equalTo("4")));
    }

    @Test
    public  void fifthRecordIsBuzz() {
        assertThat(getFizzBuzz(5), is(equalTo("Buzz")));
    }

    @Test
    public void fifteenthRecordIsFizzBuzz(){
        assertThat(getFizzBuzz(15), is(equalTo("FizzBuzz")));
    }

    private String getFizzBuzz(int nextCount) {
        String message = "";
        for (int i = 0; i< nextCount; i++) {
            message = fizzbuzz.next();
        }
        return message;
    }
}
