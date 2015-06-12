package pl.dmichalski.count_div;

/**
 * Author: Daniel
 */
public class CountDiv {

    // O(1) complexity
    public int solution(int A, int B, int K) {
        int b = B / K;
        int a = (A > 0 ? (A - 1) / K : 0);
        if (A == 0) {
            b++;
        }
        return b - a;
    }

    // O(B-A) complexity
    public int solution2(int A, int B, int K) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }
        return count;
    }

}
