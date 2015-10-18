package arithmetic

//  P34 Calculate Euler's totient function phi(m).
//      Euler's so-called totient function phi(m) is defined as the number of
//      positive integers r (1 <= r < m) that are coprime to m.  As a special
//      case, phi(1) is defined to be 1.
//      Example:
//      totient(10)
//      4

import  arithmetic.p33

Integer totient(Integer n) {
    if (n == 1) return 1
    (1..n).inject(0) { acum, m ->
        if (p33.areCoprimes(n, m))
            acum + 1
        else
            acum
    }
}

assert totient(10) == 4
assert totient(90) == 24
