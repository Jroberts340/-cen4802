public class Fibonacci {

    public static void main(String[] args) {

        int nth = 10;

        System.out.println("The F" + nth + " term of the Fibonacci sequence is: " + nthPlace(nth));

    }

    /**
     * Returns the value of the nth place in the Fibonacci sequence.
     * The n argument specifies the F(n) number place being passed into the nthPlace method.
     * <p>
     * This method uses the equation of recurrence relation to calculate
     * what the corresponding value of the given F(n) number place
     * (nth term) is.
     *
     * @author 	   Justin Roberts
     * @param  n	   the F(n) number place passed from the main method
     * @return      the value correlating to the given F(n) number place
     */
    public static int nthPlace(int n)
    {
        if (n <= 1)
            return n;

        return nthPlace(n-1) + nthPlace(n-2);
    }
}
