package pl.dmichalski.passing_cars;

/**
 * Author: Daniel
 * Correctness: 100%
 * Performance: 100%
 */
public class Runner {

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        PassingCars passingCars = new PassingCars();
        int solution = passingCars.solution(A);
        System.out.println("solution = " + solution);
    }

}
