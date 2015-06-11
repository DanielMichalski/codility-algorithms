package pl.dmichalski.codility_algorithm.perm_missing_elem;

/**
 * Author: Daniel
 * Correctness: 100%
 * Performance: 100%
 */
public class Runner {

    public static void main(String[] args) {
        int[] values = {2, 3, 1, 5};
        PermMissingElem permMissingElem = new PermMissingElem();
        int solution = permMissingElem.solution(values);
        System.out.println("solution = " + solution);
    }

}
