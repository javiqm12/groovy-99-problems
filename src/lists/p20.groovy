package lists

//  P20 Remove the Kth element of a list.
//      Return the list and the removed element in a List.
//      Elements are numbered from 0.
//      Example:
//      removeAt(3, [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
//      [3, [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11]]

List removeAt(Integer n, List ls) {
    [ls.remove(n), ls]
}

assert removeAt(3, [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [3, [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11]]
assert removeAt(2, ['a', 'b', 'c', 'd']) == ['c', ['a', 'b', 'd']]
