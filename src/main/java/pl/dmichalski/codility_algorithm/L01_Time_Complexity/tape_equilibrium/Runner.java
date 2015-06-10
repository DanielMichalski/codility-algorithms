package pl.dmichalski.codility_algorithm.L01_Time_Complexity.tape_equilibrium;

/**
 * Author: Daniel
 * The command of the task is in resources
 * Correctness: 100%
 * Performance: 100%
 */
public class Runner {
    public static void main(String[] args) {
        int[] values = {3, 1, 2, 4, 3};
        TapeEquilibrium algorithm1 = new TapeEquilibrium();

        int solution = algorithm1.solution(values, values.length);
        System.out.println("solution = " + solution);
    }
}
