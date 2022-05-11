import com.company.InverseFizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InverFizzBuzzTest extends InverseFizzBuzz {
    @Test
    public void fizz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(3);
        Assertions.assertEquals(output, this.exec("Fizz"));
    }

    @Test
    public void buzz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(5);
        Assertions.assertEquals(output, this.exec("Buzz"));
    }

    @Test
    public void fizzbuzz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(15);
        Assertions.assertEquals(output, this.exec("FizzBuzz"));
    }

    @Test
    public void fizz_fizz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(6);
        output.add(7);
        output.add(8);
        output.add(9);
        Assertions.assertEquals(output, this.exec("Fizz Fizz"));
    }

    @Test
    public void fizz_buzz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(9);
        output.add(10);
        Assertions.assertEquals(output, this.exec("Fizz Buzz"));
    }

    @Test
    public void fizz_fizzbuzz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(12);
        output.add(13);
        output.add(14);
        output.add(15);
        Assertions.assertEquals(output, this.exec("Fizz FizzBuzz"));
    }

    @Test
    public void fizzbuzz_fizz_test(){
        List<Integer> output = new ArrayList<>();
        output.add(15);
        output.add(16);
        output.add(17);
        output.add(18);
        Assertions.assertEquals(output, this.exec("FizzBuzz Fizz"));
    }

    @Test
    public void invalidInput_test_two_word(){
        List<Integer> output = new ArrayList<>();
        Assertions.assertEquals(output, this.exec("asdf asdf"));
    }

    @Test
    public void invalidInput_test_one_word(){
        List<Integer> output = new ArrayList<>();
        Assertions.assertEquals(output, this.exec("asdf"));
    }
}
