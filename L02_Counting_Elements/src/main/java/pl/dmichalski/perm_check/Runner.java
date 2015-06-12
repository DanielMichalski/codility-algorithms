package pl.dmichalski.perm_check;

/**
 * Author: Daniel
 * Correctness: 100%
 * Performance: 100%
 */
public class Runner {

    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};

        PermCheck permCheck = new PermCheck();
        int solution = permCheck.solution(A);
        System.out.println("solution = " + solution);
    }

}
