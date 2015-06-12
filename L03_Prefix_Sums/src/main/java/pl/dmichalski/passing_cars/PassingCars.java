package pl.dmichalski.passing_cars;

/**
 * Author: Daniel
 */
public class PassingCars {

    public int solution(int[] A) {
        int n = A.length;
        int count = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        int leftSum = 0;
        int rightSum;
        for (int i = 0; i < n; i++) {
            leftSum += A[i];
            rightSum = sum - leftSum;
            if (A[i] == 0 && rightSum > 0) {
                count += rightSum;
                if (count > 1000000000) return -1;
            }
        }
        return count;
    }

}
