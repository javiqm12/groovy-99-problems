package lists

//  P11 Modified run-length encoding.
//      Modify the result of problem P10 in such a way that if an element has no
//      duplicates it is simply copied into the result list.  Only elements with
//      duplicates are transferred as (N, E) terms.
//  Example:
//      pack([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5])
//      [[4, 1], 2, [2, 3], [2, 1], 4, [4, 5]]

import lists.p09
import lists.p10

List encode(List ls) {
    def subres = p09.packRecursive(ls)
    List result = []
    for (sls in subres) {
        if (sls.size() > 1)
            result << [sls.size(), sls[0]]
        else
            result << sls[0]
    }
    result
}

List encodeFunctional(List ls) {
    p10.encodeFunctional(ls).collect { if (it[0] == 1) it[1] else it }
}

//println "encode([1, 2, 2]) = " + encode([1, 2, 2])
//println "encode([]) = " + encode([])
//println "pack([1, 1, 2]) = " + pack([1, 1, 2])
//println "pack([1, 1, 2, 3, 3]) = " + pack([1, 1, 2, 3, 3])
//println "pack([]) = " + pack([]) 
assert encode([1, 2, 2]) == [1, [2, 2]]
assert encode([1, 1, 2]) == [[2, 1], 2]
assert encode([1, 1, 2, 3, 3]) == [[2, 1], 2, [2, 3]]
assert encode([]) == []
assert encode([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]) == [[4, 1], 2, [2, 3], [2, 1], 4, [4, 5]]

assert encodeFunctional([1, 2, 2]) == [1, [2, 2]]
assert encodeFunctional([1, 1, 2]) == [[2, 1], 2]
assert encodeFunctional([1, 1, 2, 3, 3]) == [[2, 1], 2, [2, 3]]
assert encodeFunctional([]) == []
assert encodeFunctional([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]) == [[4, 1], 2, [2, 3], [2, 1], 4, [4, 5]]
