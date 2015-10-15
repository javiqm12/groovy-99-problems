package lists

//  P12 Decode a run-length encoded list.
//      Given a run-length code list generated as specified in problem P10,
//      construct its uncompressed version.
//  Example:
//      decode([[4, 1], [1, 2], [2, 3], [2, 1], [1, 4], [4, 5]])
//      [1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]

List decode(List ls) {
    List result = []
    for (sls in ls) {
        result << ([sls[1]] * sls[0])
    }
    result.flatten()
}

List decodeFunctional(List ls) {
    ls.collect { [it[1]] * it[0] }.flatten()
}

assert decode([[1, 1], [2, 2]]) == [1, 2, 2]
assert decode([[2, 1], [1, 2]]) == [1, 1, 2]
assert decode([[2, 1], [1, 2], [2, 3]]) == [1, 1, 2, 3, 3]
assert decode([]) == []
assert decode([[4, 1], [1, 2], [2, 3], [2, 1], [1, 4], [4, 5]]) == [1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]

assert decodeFunctional([[1, 1], [2, 2]]) == [1, 2, 2]
