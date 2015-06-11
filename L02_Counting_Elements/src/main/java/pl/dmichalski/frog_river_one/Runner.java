package pl.dmichalski.frog_river_one;

/**
 * Author: Daniel
 * Correctness: 100%
 * Performance: 100%
 */
public class Runner {

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int solution = frogRiverOne.solution(5, A);
        System.out.println("solution = " + solution);
    }

}
