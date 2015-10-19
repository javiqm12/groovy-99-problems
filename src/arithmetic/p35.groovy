package arithmetic

//  P35 Determine the prime factors of a given positive integer.
//      Construct a flat list containing the prime factors in ascending order.
//      Example:
//      totient(10)
//      4

List primeFactors(Integer n) {
    def result = []
    if (n > 3) {
        def L = [2] + (3..Math.sqrt(n).intValue()).findAll { it % 2 != 0 }
        for (m in L) {
            if (m * m > n) break
            while (n % m == 0) {
                if (n == m) break
                n = n.intdiv(m)
                result += m
            }
        }
    }
    result += n
    return result
}

assert primeFactors(315) == [3, 3, 5, 7]
assert primeFactors(11*13*17) == [11, 13, 17]
assert primeFactors(23*31) == [23, 31]
