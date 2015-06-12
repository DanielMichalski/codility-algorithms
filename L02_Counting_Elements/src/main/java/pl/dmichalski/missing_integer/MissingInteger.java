package pl.dmichalski.missing_integer;

/**
 * Author: Daniel
 */
public class MissingInteger {

    public int solution(int[] A) {
        int max = A.length;
        int threshold = 1;
        boolean[] bitmap = new boolean[max + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= max) {
                bitmap[A[i]] = true;
            }

            if (A[i] > threshold) {
                threshold = A[i];
            }
        }

        //find the first positive number in bitmap that is false.
        for (int i = 1; i < bitmap.length; i++) {
            if (!bitmap[i]) {
                return i;
            }
        }

        //this is to handle the case when input array is not missing any element.
        return (threshold+1);
    }

    public int mySolution(int[] A) {
        int max = findMax(A);
        if (max<=0) return 1;

        boolean[] check = new boolean[max + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                check[A[i]] = true;
            }
        }
        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {
                return i;
            }
        }
        return max + 1;
    }

    private int findMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

}
