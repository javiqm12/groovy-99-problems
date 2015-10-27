package arithmetic

//  P38 Compare the two methods of calculating Euler's totient function.
//      Use the solutions of problems P34 and P37 to compare the algorithms.  Try
//      to calculate phi(10090) as an example.
//  Example:
//      totient(10)
//      4

import arithmetic.p34
import arithmetic.p37

def compareTotientImplementations(Integer n) {
    def t0 = System.currentTimeMillis()
    def totient1 = p34.totient(n) 
    def t1 = System.currentTimeMillis()
    println "p34.totient($n): ${t1 - t0} ms."
    t0 = System.currentTimeMillis()
    def totient2 = p37.totient(n)
    t1 = System.currentTimeMillis()
    println "p37.totient($n): ${t1 - t0} ms."
}

compareTotientImplementations(10090)
compareTotientImplementations(10090)

// Using a closure to mesure duration
static def benchmark(Closure closure) {
    def start = System.currentTimeMillis()
    closure.call()
    System.currentTimeMillis() - start
}

println "Duration p34.totient(10090): ${benchmark { p34.totient(10090) }} ms"
println "Duration p37.totient(10090): ${benchmark { p37.totient(10090) }} ms"
