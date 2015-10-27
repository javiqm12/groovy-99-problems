package arithmetic

//  P40 Goldbach's conjecture.
//      Goldbach's conjecture says that every positive even number greater than 2
//      is the sum of two prime numbers.  E.g. 28 = 5 + 23.  It is one of the
//      most famous facts in number theory that has not been proved to be correct
//      in the general case.  It has been numerically confirmed up to very large
//      numbers (much larger than Scala's Int can represent).  Write a function
//      to find the two prime numbers that sum up to a given even integer.
//  Example:
//      goldbach(28)
//      [5, 23]

import arithmetic.p39

def goldbach(n) {
    def pris = p39.primesUpTo(n)
    def a = pris.takeWhile { it < n } find { (n - it) in pris }
    [a, n - a]
}

assert goldbach(28) == [5, 23]

