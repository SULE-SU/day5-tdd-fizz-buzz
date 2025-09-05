package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_cinput_1() {
        int order = 1;

        String word = FizzBuzz.countOff(order);

        assert word.equals("1");

    }


}
