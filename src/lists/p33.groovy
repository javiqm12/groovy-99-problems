package lists

//  P33 Determine if two numbers are coprime.
//      Example:
//      corpime(35, 64)
//      true

import  lists.p32

Boolean areCoprimes(Integer a, Integer b) {
    1 == p32.gcd(a, b)
}

assert areCoprimes(35, 64)
assert areCoprimes(64, 35)
assert !areCoprimes(3, 9)