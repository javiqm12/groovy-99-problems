package arithmetic

//  P39 Generate a list of primes in a given range.
//  Example:
//      primesInRenge(7, 31)
//      [7, 11, 13, 17, 19, 23, 29, 31]

import arithmetic.p38

static def primesUpTo(bound) { 
    def isPrime  = new BitSet(bound)
    isPrime[0..1] = false
    isPrime[2..bound] = true
    (2..(Math.sqrt(bound))).each { pc ->
        if (isPrime[pc]) {
            ((pc**2)..bound).step(pc) { isPrime[it] = false }
        }
    }
    (0..bound).findAll { isPrime[it] }
}

def primesInRange(a, b) {
    primesUpTo(b).dropWhile { it < a }
}

assert primesInRange(7, 31) == [7, 11, 13, 17, 19, 23, 29, 31]

def benchmark = { closure ->
    start = System.currentTimeMillis()
    closure.call()
    System.currentTimeMillis() - start
}

println "Duration primesUpTo(10000):  ${p38.benchmark { primesUpTo(10000) }} ms"
println "Duration primesUpTo(100000): ${p38.benchmark { primesUpTo(100000) }} ms"
