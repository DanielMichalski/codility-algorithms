package pl.dmichalski.codility_algorithm.tape_equilibrium;

/**
 * Author: Daniel
 */
public class TapeEquilibrium {

    int solution(int A[], int N) {
        int min = -1;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        int leftSum = 0;
        for (int i = 0; i < N - 1; i++) {
            leftSum += A[i];
            int rightSum = sum - leftSum;
            int difference = leftSum - rightSum;
            if (difference < 0) {
                difference *= -1;
            }
            if (min == -1 ) {
                min = difference;
            }
            if (difference < min) {
                min = difference;
            }
        }
        return min;
    }
}
