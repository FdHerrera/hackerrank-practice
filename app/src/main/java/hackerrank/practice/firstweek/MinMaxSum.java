package hackerrank.practice.firstweek;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by
 * summing exactly four of the five integers. Then print the respective minimum and maximum values
 * as a single line of two space-separated long integers.
 * @author federico.herrera
 */
public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        List<Long> longsArr = arr.stream().map(x -> (long) x).collect(Collectors.toList());

        Long minVal = LongStream.range(0, 4).map(i -> longsArr.get((int) i)).sum();
        Long maxVal =
            LongStream.range(0, 4).map(i -> longsArr.get((int) (arr.size() - 1 - i))).sum();

        System.out.println(minVal + " " + maxVal);
    }
}
