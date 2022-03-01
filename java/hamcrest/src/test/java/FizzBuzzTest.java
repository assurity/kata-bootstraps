import org.hamcrest.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void firstRecordIsOne(){
        assertThat(fizzbuzz.next(), is(equalTo("1")));
    }

    @Test
    public void secondRecordIsTwo(){
        fizzbuzz.next();
        assertThat(fizzbuzz.next(), is(equalTo("2")));
    }

    @Test
    public void thirdRecordIsFizz(){
        fizzbuzz.next();
        fizzbuzz.next();
        assertThat(fizzbuzz.next(), is(equalTo("Fizz")));

    }
}
