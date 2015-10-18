package arithmetic

//  P31 Determine whether a given integer number is prime.
//      Example:
//      isPrime(11)
//      true

Boolean isPrime(Integer n) {
    // Very nice and simple primality check.
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    if (n < 9) return true
    if (n % 3 == 0) return false

    counter = 5
    while (counter * counter <= n) {
        if (n % counter == 0) return false
        if (n % (counter + 2) == 0) return false
        counter += 6
    }
    return true
}

assert isPrime(2)
assert isPrime(3)
assert isPrime(5)
assert !isPrime(54)
assert !isPrime(2930487)
assert isPrime(32452843)