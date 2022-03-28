public class FizzBuzz {
    int count;

    public String next() {
        count = count + 1;
        String message = count + "";

        if (count % 3 == 0) {
            message = "Fizz";
        }

        if (count % 5 == 0) {
            message = "Buzz";
        }

        if (count % 3 == 0 && count % 5 == 0) {
            message = "FizzBuzz";
        }

        return message;
    }
}
