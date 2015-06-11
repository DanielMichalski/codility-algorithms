package pl.dmichalski.codility_algorithm.frog_jmp;

/**
 * Author: Daniel
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        int count = (Y - X) / D;
        if (diff % D > 0) {
            count++;
        }
        return count;
    }

    public int solution2(int X, int Y, int D) {
        int count = 0;
        while (X < Y) {
            X += D;
            count++;
        }
        return count;
    }

}
