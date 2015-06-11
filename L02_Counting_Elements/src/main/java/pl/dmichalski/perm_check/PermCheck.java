package pl.dmichalski.perm_check;

/**
 * Author: Daniel
 * Correctness: 100%
 * Performance: 100%
 */
public class PermCheck {

    public int solution(int[] A) {
        int n = A.length;
        boolean[] check = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (A[i] < 1 || A[i] > n) {
                return 0;
            }
            if (check[A[i]]) {
                return 0;
            }
            check[A[i]] = true;
        }
        return 1;
    }

}
