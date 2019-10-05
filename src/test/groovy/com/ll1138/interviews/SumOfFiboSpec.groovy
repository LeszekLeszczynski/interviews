package com.ll1138.interviews

import spock.lang.Specification

class SumOfFiboSpec extends Specification {

    def "SumOfFibo.get returns sum of fibonacci numbers that smaller than n"() {
        // 1 1 2 3 5 8 13 21
        expect:
        SumOfFibo.get(a) == b

        where:
        a | b
        0 | 0
        1 | 0
        2 | 2
        3 | 4
        10 | 20
        25 | 54
    }
}
