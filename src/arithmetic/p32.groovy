package arithmetic

//  P32 Determine the greatest common divisor of two positive integer numbers.
//      Use Euclid's algorithm.
//      Example:
//      gcd(15, 9)
//      3

import static Math.abs
import static Math.max
import static Math.min

import groovy.transform.TailRecursive
@TailRecursive
Long gcdRecursive(Long i, Long j) {
    if (j == 0) return i
    else return gcdRecursive(j, i % j)
}

static Long gcd(Long i, Long j) {
    while (j != 0 )
        (i, j) = [j, i % j]
    return i
}

assert gcdRecursive(29951157, 9) == 3
assert gcdRecursive(15, 9) == gcdRecursive(9,15)

assert gcd(29951157, 9) == 3
assert gcd(15, 9) == gcd(9, 15)


