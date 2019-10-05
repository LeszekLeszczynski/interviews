package com.ll1138.interviews

import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def "FizzBuzz 1..16"() {
        given:
        int count = 16

        when:
        def fizzbuzz = FizzBuzz.get(count)
        def expected = ["1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16"]

        then:
        fizzbuzz == expected
    }

    def "FizzBuzz.get should return empty list if count == 0"() {
        given:
        int count = 0

        when:
        def fizzbuzz = FizzBuzz.get(count)

        then:
        fizzbuzz == []
    }

    def "FizzBuzz.get should return one element if count == 1"() {
        given:
        int count = 1

        when:
        def fizzbuzz = FizzBuzz.get(count)

        then:
        fizzbuzz == ["1"]
    }
}
