public class FizzBuzzCheck {
    public static String checkFizzBuzz(int num) {
        String s = "";
        if (num > 0) {
            if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
                s += "FizzBuzzWhizz";
            } else if (num % 3 == 0 && num % 5 == 0) {
                s += "FizzBuzz";
            } else if (num % 3 == 0 && num % 7 == 0) {
                s += "FizzWhizz";
            } else if (num % 5 == 0 && num % 7 == 0) {
                s += "BuzzWhizz";
            } else if (num % 7 == 0) {
                s += "Whizz";
            } else if (num % 5 == 0) {
                s += "Buzz";
            } else if (num % 3 == 0) {
                s += "Fizz";
            } else {
                s += num;
            }
            return s;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
