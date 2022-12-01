package tdd.fizzbuzz;

public class FizzBuzz {

    public String count(int seq)
    {
        if (seq % 5 == 0 && seq % 3 == 0  && seq % 7 == 0)
            return String.valueOf("BuzzFizzWhizz");
        else if (seq % 5 == 0 && seq % 3 == 0)
            return String.valueOf("BuzzFizz");
        else if (seq % 3 == 0 && seq % 7 == 0)
            return String.valueOf("FizzWhizz");
        else if (seq % 7 == 0 && seq % 5 == 0)
            return String.valueOf("BuzzWhizz");
        else if (seq % 5 == 0)
            return String.valueOf("Buzz");
        else if (seq % 7 == 0)
            return String.valueOf("Whizz");
        else if (seq % 3 == 0)
            return String.valueOf("Fizz");
        return String.valueOf(seq);
    }
}
