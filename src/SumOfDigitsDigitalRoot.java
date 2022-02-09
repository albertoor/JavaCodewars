/*
    Digital root is the recursive sum of all the digits in a number.
    Given n, take the sum of the digits of n. If that value has more
    than one digit, continue reducing in this way until a single-digit
    number is produced. The input will be a non-negative integer.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfDigitsDigitalRoot {

    public static int solve (int n) {
        int[] numbers = Integer.toString(n).chars().map(c -> c - '0').toArray();
        int total = 0;
        for (int number: numbers) {
            total = total + number;
        }
        return total >= 10 ? solve(total) : total;
    }

    public static void main (String[]args){
        int n = 706555;
        int result = solve(n);
        System.out.println(result);
    }
}
// better solution
//return n < 10 ? n : digital_root(digital_root(n/10)+n%10);