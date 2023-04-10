package hackerrank.practice.firstweek;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Given an array of integers, calculate the ratios of its elements that are
 * positive, negative, and zero. Print the decimal value of each fraction on a
 * new line with  places after the decimal. Note: This challenge introduces
 * precision problems. The test cases are scaled to six decimal places, though
 * answers with absolute error of up to 10^-4 are acceptable.
 *
 * @author federico.herrera
 */
public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        BigDecimal positives = BigDecimal.valueOf(arr.stream().filter(x -> x > 0).count());
        BigDecimal negatives = BigDecimal.valueOf(arr.stream().filter(x -> x < 0).count());
        BigDecimal zeros = BigDecimal.valueOf(arr.stream().filter(x -> x == 0).count());
        BigDecimal arrLength = BigDecimal.valueOf(arr.size());

        System.out.println(positives.divide(arrLength, 6, RoundingMode.HALF_UP));
        System.out.println(negatives.divide(arrLength, 6, RoundingMode.HALF_UP));
        System.out.println(zeros.divide(arrLength, 6, RoundingMode.HALF_UP));
    }
}
