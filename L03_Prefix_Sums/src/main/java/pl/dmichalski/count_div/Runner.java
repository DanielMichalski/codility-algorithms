package pl.dmichalski.count_div;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        int a = 6;
        int b = 11;
        int k = 2;

        CountDiv countDiv = new CountDiv();
        int solution = countDiv.solution(a, b, k);
        System.out.println("solution = " + solution);
    }

}
