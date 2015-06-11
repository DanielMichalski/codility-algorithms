package pl.dmichalski.frog_river_one;

/**
 * Author: Daniel
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int steps = X;
        boolean[] bitmap = new boolean[steps + 1];
        for (int i = 0; i < A.length; i++) {
            if (!bitmap[A[i]]) {
                bitmap[A[i]] = true;
                steps--;
            }
            if (steps == 0) return i;
        }
        return -1;
    }

}
