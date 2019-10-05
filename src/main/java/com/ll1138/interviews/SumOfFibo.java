package com.ll1138.interviews;

public class SumOfFibo {

    /**
     * Returns sum of Fibonacci numbers smaller than max
     *
     * Remember that "1" is represented *thice* in the sequence, so e.g. get(2) should return 2
     *
     * @param max
     * @return
     */
    public static int get(int max) {

        //no need to overthink this

        int n2 = 0, n1 = 1, n = 1;

        int sum = 0;

        while (n < max) {
            sum += n;
            n = n1 + n2;
            n2 = n1;
            n1 = n;
        }

        return sum;
    }
}
