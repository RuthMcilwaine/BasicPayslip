
public class FizzBuzz {
    private int count;

    public String getNext() {
        
        count++;
        if (count % 15 == 0) {
            return "FizzBuzz";
        }
        if (count % 3 == 0) {
            return "Fizz";
        }
        if (count % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(count);
    }
}
