package tdd.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    void should_get_number_when_count_given_one()
    {
        int seq = 1;

        String expect = new FizzBuzz().count(seq);

        assertEquals("1", expect);
    }
    @Test
    void should_get_number_when_count_is_three_multiple()
    {
        int seq = 3;

        String expect = new FizzBuzz().count(seq);

        assertEquals("Fizz", expect);
    }
    @Test
    void should_get_number_when_count_is_five_multiple()
    {
        int seq = 5;

        String expect = new FizzBuzz().count(seq);

        assertEquals("Buzz", expect);
    }

    @Test
    void should_get_number_when_count_is_seven_multiple()
    {
        int seq = 7;

        String expect = new FizzBuzz().count(seq);

        assertEquals("Whizz", expect);
    }
    @Test
    void should_get_number_when_count_is_seven_and_five_multiple()
    {
        int seq = 15;

        String expect = new FizzBuzz().count(seq);

        assertEquals("FizzBuzz", expect);
    }

    @Test
    void should_get_number_when_count_is_three_and_seven_multiple()
    {
        int seq = 21;

        String expect = new FizzBuzz().count(seq);

        assertEquals("WhizzFizz", expect);
    }

    @Test
    void should_get_number_when_count_is_five_and_seven_multiple()
    {
        int seq = 35;

        String expect = new FizzBuzz().count(seq);

        assertEquals("WhizzBuzz", expect);
    }

    @Test
    void should_get_number_when_count_is_five_and_seven_and_three_multiple()
    {
        int seq = 105;

        String expect = new FizzBuzz().count(seq);

        assertEquals("WhizzBuzzFizz", expect);
    }
}
