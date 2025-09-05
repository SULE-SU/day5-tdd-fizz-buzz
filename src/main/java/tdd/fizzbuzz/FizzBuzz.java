package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int order) {
        if (order % 3 != 0 && order % 5 != 0) {
            return "" + order;
        } else if (order % 5 == 0 && order % 3 != 0) {
            return "Buzz";
        } else if (order % 3 == 0 && order % 5 != 0) {
            return "Fizz";
        } else {
            return "FizzBuzz";
        }
    }

}