package arithmetic

//  P41 A list of Goldbach compositions.
//      Given a range of integers by its lower and upper limit, print a list of
//      all even numbers and their Goldbach composition.
//  Example:
//      goldbachList(9, 20)
//      10 = 3 + 7
//      12 = 5 + 7
//      14 = 3 + 11
//      16 = 3 + 13
//      18 = 5 + 13
//      20 = 3 + 17
//
//  Part 2:
//      In most cases, if an even number is written as the sum of two prime
//      numbers, one of them is very small.  Very rarely, the primes are both
//      bigger than, say, 50.  Try to find out how many such cases there are in
//      the range 2..3000.
//
//      Example (minimum value of 50 for the primes):
//      goldbachListLimited(1, 2000, 50)
//      992 = 73 + 919
//      1382 = 61 + 1321
//      1856 = 67 + 1789
//      1928 = 61 + 1867

import arithmetic.p40

def goldbachList(lower, upper) {
    
    if (lower & 1) lower += 1
    if (lower < 4) lower = 4
    for (n in (lower .. upper).step(2)) {
        def gb = p40.goldbach(n)
        println "$n = ${gb[0]} + ${gb[1]}"
    }
}

def goldbachListLimit(lower, upper, limit) {
    if (lower & 1) lower += 1
    if (lower < 4) lower = 4
    for (n in (lower .. upper).step(2)) {
        def gb = p40.goldbach(n)
        if (gb[0] > limit) println "$n = ${gb[0]} + ${gb[1]}"
    }
}

goldbachList(9, 20)
println '\nPart 2:'
goldbachListLimit(1, 2000, 50)
