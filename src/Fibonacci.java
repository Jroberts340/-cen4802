import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static Map<Long, Long> store = new HashMap<>();
    public static void main(String[] args) {

        printMe(8);
        printMe(50);
        printMe(10);
        printMe(4);
    }

    /**
     * Returns the value of the nth place in the Fibonacci sequence.
     * The n argument specifies the F(n) number place being passed into the nthPlace method.
     * <p>
     * This method uses the equation of recurrence relation to calculate
     * what the corresponding value of the given F(n) number place
     * (nth term) is. This method also implements a Hash Map for efficiency
     * purposes.
     *
     * @author 	    Justin Roberts
     * @param  n	the F(n) number place passed from the printMe method
     * @return      the value correlating to the given F(n) number place
     */
    public static long nthPlace(long n)
    {
        if (n == 1 || n == 2){
            return 1;
        }
        else if (store.containsKey(n)){
            return store.get(n);
        }

        long result = nthPlace(n-1) + nthPlace(n-2);
        store.put(n, result);

        return result;
    }

    /**
     * Prints out to the console
     * "The F(" + n + ") term of the Fibonacci sequence is: " + nthPlace(n))
     * The n argument specifies the F(n) number place being passed into the printMe method
     * and the nthPlace method mentioned at the end of the String is the method that the
     * n argument is passed into.
     * <p>
     * This method simply prints to the console the desired output of the developer.
     *
     * @author 	    Justin Roberts
     * @param  n	the F(n) number place passed from the printMe method
     * @return      the desired output of the author in String form
     */
    public static void printMe(long n){
        System.out.println("The F(" + n + ") term of the Fibonacci sequence is: " + nthPlace(n));
    }
}
