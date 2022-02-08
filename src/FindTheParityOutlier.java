/*
You are given an array (which will have a length of at least 3, but could be
very large) containing integers. The array is either entirely comprised of odd
integers or entirely comprised of even integers except for a single integer
N. Write a method that takes the array as an argument and returns this
"outlier" N.

    EXAMPLES
    [2, 4, 0, 100, 4, 11, 2602, 36]
    Should return: 11 (the only odd number)

    [160, 3, 1719, 19, 11, 13, -21]
    Should return: 160 (the only even number)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        // My solution
        int [] integers = {160, 3, 1719, 19, 11, 13, -21};
        Integer [] iArr = Arrays.stream(integers).boxed().toArray(Integer[]::new);
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, iArr);

        List<Integer> even = nums.stream()
                .filter(n -> n%2 == 0).collect(Collectors.toList());
        List<Integer> odd = nums.stream()
                .filter(n -> n%2 != 0).collect(Collectors.toList());

        int result = 0;
        if (odd.size() == 1 ) result = odd.get(0);
        if (even.size() == 1) result = even.get(0);
        System.out.println(result);
    }
}
// another solutions from codewars users
//    static int find(int[] integers) {
//        int even = 0;
//        int odd = 0;
//        int cycle = 0;
//
//        for(Integer value : integers) {
//            if(value % 2 == 0) {
//                cycle++;
//                even = value;
//            }else {
//                odd = value;
//            }
//        }
//        return (cycle > 1) ? odd : even;
//    }

//    static int find(int[] integers) {
//        int oddcount = 0, odd = 0, evencount = 0, even = 0;
//        for (int i : integers) {
//            if (i % 2 == 0) {
//                even = i;
//                evencount++;
//            } else {
//                odd = i;
//                oddcount++;
//            }
//            if (evencount > 0 && oddcount > 0) {
//                if (evencount > 1) {
//                    return odd;
//                } else if (oddcount > 1) {
//                    return even;
//                }
//            }
//        }
//        return evencount > 1 ? odd : even;
//    }