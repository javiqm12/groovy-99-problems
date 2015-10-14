package lists

//  P09 Pack consecutive duplicates of list elements into sublists.
//      If a list contains repeated elements they should be placed in separate
//      sublists.
//  Example:
//      pack([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5])
//      [[1, 1, 1, 1], [2], [3, 3], [1, 1], [4], [5, 5, 5, 5]]

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

//println "pack([1, 2, 2]) = " + pack([1, 2, 2])
//println "pack([1, 1, 2]) = " + pack([1, 1, 2])
//println "pack([1, 1, 2, 3, 3]) = " + pack([1, 1, 2, 3, 3])
//println "pack([]) = " + pack([]) 
assert pack([1, 2, 2]) == [[1], [2, 2]]
assert pack([1, 1, 2]) == [[1, 1], [2]]
assert pack([1, 1, 2, 3, 3]) == [[1, 1], [2], [3, 3]]
assert pack([]) == []
assert pack([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]) == [[1, 1, 1, 1], [2], [3, 3], [1, 1], [4], [5, 5, 5, 5]]