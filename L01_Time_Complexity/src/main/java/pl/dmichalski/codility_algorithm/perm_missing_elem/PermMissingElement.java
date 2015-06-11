package pl.dmichalski.codility_algorithm.perm_missing_elem;

/**
 * Author: Daniel
 */
public class PermMissingElement {

    int solution(int A[]) {
        long N = A.length + 1;
        long total = N * (N + 1) / 2;

        for (int i = 0; i < A.length; i++) {
            total -= A[i];
        }

        return (int)total;
    }

}
