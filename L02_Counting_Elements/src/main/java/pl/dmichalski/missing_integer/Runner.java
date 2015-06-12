package pl.dmichalski.missing_integer;

/**
 * Author: Daniel
 * Correctness: 100%
 * Performance: 100%
 */
public class Runner {

    public static void main(String[] args) {
        int[] A = {-1,5};
        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(A);
        System.out.println("solution = " + solution);
    }

}
