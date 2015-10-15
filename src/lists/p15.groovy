package lists

//  P15 Duplicate the elements of a list a given number of times.
//  Example:
//      duplicate([1, 2, 3, 3, 4])
//      [1, 1, 2, 2, 3, 3, 3, 3, 4, 4]

List duplicateN(Integer n, List ls) {
    ls.collect { [it] * n }.flatten()
}

List duplicateN2(Integer n, List ls) {
    ls.inject([]) { la, e -> la + ([e] * n) }
}

assert duplicateN(2, [1, 2, 3, 3, 4]) == [1, 1, 2, 2, 3, 3, 3, 3, 4, 4]
assert duplicateN(3, [1, 2]) == [1, 1, 1, 2, 2, 2]
assert duplicateN(5, []) == []
assert duplicateN(2, ['a']) == ['a', 'a']

assert duplicateN2(2, [1, 2, 3, 3, 4]) == [1, 1, 2, 2, 3, 3, 3, 3, 4, 4]
assert duplicateN2(3, [1, 2]) == [1, 1, 1, 2, 2, 2]
assert duplicateN2(5, []) == []
assert duplicateN2(2, ['a']) == ['a', 'a']
