package hackerrank.practice.firstweek;

import java.util.List;

/*
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *
 * @author federico.herrera
 */
public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a) {
        Integer uniqueInteger = 0;
        for (Integer numb: a) {
            uniqueInteger ^= numb;
        }
        return uniqueInteger;
    }
}
