package lists

//  P13 Run-length encoding of a list (direct solution).
//      Implement the so-called run-length encoding data compression method
//      directly.  I.e. don't use other methods you've written (like p09's
//      pack); do all the work directly.
//  Example:
//      pack([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5])
//      [[4, 1], [1, 2], [2, 3], [2, 1], [1, 4], [4, 5]]

static List encodeFunctional(List ls) {
    if (!ls) return ls
    List lsh = ls.takeWhile { it == ls.head() }
    [[lsh.size(), lsh[0]]] + encodeFunctional(ls.dropWhile { it == ls.head() })
}

assert encodeFunctional([1, 2, 2]) == [[1, 1], [2, 2]]
assert encodeFunctional([1, 1, 2]) == [[2, 1], [1, 2]]
assert encodeFunctional([1, 1, 2, 3, 3]) == [[2, 1], [1, 2], [2, 3]]
assert encodeFunctional([]) == []
assert encodeFunctional([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]) == [[4, 1], [1, 2], [2, 3], [2, 1], [1, 4], [4, 5]]
