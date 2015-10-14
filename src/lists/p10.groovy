package lists

//  P10 Run-length encoding of a list.
//      Use the result of problem P09 to implement the so-called run-length
//      encoding data compression method. Consecutive duplicates of elements
//      are encoded as tuples (N, E) where N is the number of duplicates of the
//      element E.
//  Example:
//      pack([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5])
//      [[4, 1], [1, 2], [2, 3], [2, 1], [1, 4], [4, 5]]

//evaluate(new File('src/lists/p09.groovy'))

List pack(List ls) {
    List result = []
    for (int i = 0; i < ls.size(); i++) {
        List subresult = [ls[i]]
        boolean duplicateFound = false
        int j = i + 1
        for (; j < ls.size() && ls[i] == ls[j]; j++) {
            duplicateFound = true
            subresult << ls[j]
        }
        if (duplicateFound) {
            i = j - 1
        }
        result << subresult
    }
    result
}

List encode(List ls) {
    def subres = pack(ls)
    List result = []
    for (sls in subres) {
        result << [sls.size(), sls[0]]
    }
    result
}

//println "encode([1, 2, 2]) = " + encode([1, 2, 2])
//println "encode([]) = " + encode([])
//println "pack([1, 1, 2]) = " + pack([1, 1, 2])
//println "pack([1, 1, 2, 3, 3]) = " + pack([1, 1, 2, 3, 3])
//println "pack([]) = " + pack([]) 
assert encode([1, 2, 2]) == [[1, 1], [2, 2]]
assert encode([1, 1, 2]) == [[2, 1], [1, 2]]
assert encode([1, 1, 2, 3, 3]) == [[2, 1], [1, 2], [2, 3]]
assert encode([]) == []
assert encode([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]) == [[4, 1], [1, 2], [2, 3], [2, 1], [1, 4], [4, 5]]