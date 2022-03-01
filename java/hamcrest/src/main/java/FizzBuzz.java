public class FizzBuzz {
    int count;

    public String next() {
        count = count+1;
        String message = count + "";

        if (count%3 == 0) {
            message = "Fizz";
        }

        return message;
    }
}
