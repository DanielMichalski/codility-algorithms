package pl.dmichalski.max_counters;

import java.util.Arrays;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int n = 5;

        MaxCounters maxCounters = new MaxCounters();
        int[] solution = maxCounters.solution(n, A);
        System.out.println("solution = " + Arrays.toString(solution));
    }

}
