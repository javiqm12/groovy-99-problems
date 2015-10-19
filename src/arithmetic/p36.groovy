package arithmetic

//  P36 Determine the prime factors of a given positive integer (2).
//     Construct a list containing the prime factors and their multiplicity.
//  Example:
//      primeFactorMultiplicity(315)
//      [[3, 2], [5, 1], [7, 1]]

import lists.p09
import arithmetic.p35

static List primeFactorsMultiplicity(Long n) {
    p09.packTailRecursive( p35.primeFactors(n) ).collect { [it[0], it.size()] }
}

assert primeFactorsMultiplicity(315) == [[3, 2], [5, 1], [7, 1]]
assert primeFactorsMultiplicity(3*3*3*5*5*31*31*31) == [[3, 3], [5, 2], [31, 3]]