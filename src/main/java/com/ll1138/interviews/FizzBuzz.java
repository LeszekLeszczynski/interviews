package com.ll1138.interviews;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static List<String> get(int count) {

        return IntStream.rangeClosed(1, count)
                .boxed()// we need to use this to convert IntStream to Stream<Integer> ... Java FTW
                .map(new FizzBuzzFn()) //otherwise FizzBuzzFn would have to be an IntFunction
                .collect(Collectors.toList());
    }
}

/**
 * This approach uses a StringBuilder instead of a more "traditional"
 * if(n % 3 == 0 && n % 5 == 0) return "fizzbuzz" etc
 *
 * This approach deals with the inevitable follow-up question
 * "now let's introduce a third option, when n is divisible by seven etc"
 * Adding new options is now super easy
 *
 * See FizzBuzzSpec for tests
 */
class FizzBuzzFn implements Function<Integer, String> {

    @Override
    public String apply(Integer n) {
        StringBuilder sb = new StringBuilder();

        if (n % 3 == 0) sb.append("fizz");
        if (n % 5 == 0) sb.append("buzz");

        if (sb.length() == 0) sb.append(n);

        return sb.toString();
    }
}
