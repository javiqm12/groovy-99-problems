package lists

//  P09 Pack consecutive duplicates of list elements into sublists.
//      If a list contains repeated elements they should be placed in separate
//      sublists.
//  Example:
//      pack([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5])
//      [[1, 1, 1, 1], [2], [3, 3], [1, 1], [4], [5, 5, 5, 5]]

static List pack(List ls) {
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

static List packRecursive(List ls) {
    if (!ls) return ls
    List lsh = ls.takeWhile { it == ls.head() }
    [lsh] + packRecursive(ls.dropWhile { it == ls.head() })
}

import groovy.transform.TailRecursive
@TailRecursive
static List packTailRecursive(List ls, List pack = []) {
    if (!ls) return pack
    pack << ls.takeWhile { it == ls.head() }
    packTailRecursive(ls.dropWhile { it == ls.head() }, pack)
}

List ls = [1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]

assert pack([1, 2, 2]) == [[1], [2, 2]]
assert pack([1, 1, 2]) == [[1, 1], [2]]
assert pack([1, 1, 2, 3, 3]) == [[1, 1], [2], [3, 3]]
assert pack([]) == []
assert pack(ls) == [[1, 1, 1, 1], [2], [3, 3], [1, 1], [4], [5, 5, 5, 5]]

//println "packRecursive(ls) = ${packRecursive(ls)}"
assert packRecursive(ls) == [[1, 1, 1, 1], [2], [3, 3], [1, 1], [4], [5, 5, 5, 5]]
assert packRecursive([1, 2, 2]) == [[1], [2, 2]]
assert packRecursive([1, 1, 2]) == [[1, 1], [2]]
assert packRecursive([1, 1, 2, 3, 3]) == [[1, 1], [2], [3, 3]]
assert packRecursive([]) == []

assert packTailRecursive(ls) == [[1, 1, 1, 1], [2], [3, 3], [1, 1], [4], [5, 5, 5, 5]]
assert packTailRecursive([1, 2, 2]) == [[1], [2, 2]]
assert packTailRecursive([1, 1, 2]) == [[1, 1], [2]]
assert packTailRecursive([1, 1, 2, 3, 3]) == [[1, 1], [2], [3, 3]]
assert packTailRecursive([]) == []
