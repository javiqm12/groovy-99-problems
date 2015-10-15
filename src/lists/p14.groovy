package lists

//  P14 Duplicate the elements of a list.
//  Example:
//      duplicate([1, 2, 3, 3, 4])
//      [1, 1, 2, 2, 3, 3, 3, 3, 4, 4]

List duplicate(List ls) {
    ls.collect { [it, it] }.flatten()
}

assert duplicate([1, 2, 3, 3, 4]) == [1, 1, 2, 2, 3, 3, 3, 3, 4, 4]
assert duplicate([1, 1, 2]) == [1, 1, 1, 1, 2, 2]
assert duplicate([5]) == [5, 5]
assert duplicate([]) == []
assert duplicate(['a']) == ['a', 'a']
