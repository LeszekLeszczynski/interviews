package com.ll1138.interviews

import spock.lang.Specification

class StringPalindromeSpec extends Specification {

    def "checks if a string is a palindrome, ignoring uppercase and whitespace"() {

        expect:
        StringPalindrome.check(a) == b

        where:
        a | b
        "kayyak" | true
        "kayak" | true
        "kayac" | false
        "A nut for a jar of tuna" | true
    }
}
