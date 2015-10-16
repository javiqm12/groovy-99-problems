package lists

//  P18 Extract a slice from a list.
//      Given two indices, I and K, the slice is the list containing the elements
//      from and including the Ith element up to but not including the Kth
//      element of the original list.  Start counting the elements with 0.
//  Example:
//      slice(3, 7, [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
//      [3, 4, 5, 6]

List slice(Integer start, Integer end, List ls) {
    ls[start..<end]
}

//println slice(3, 7, [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
//println slice(3, 3, [])
//println slice(2, 2, [0, 1, 2, 3, 4])
assert slice(3, 7, [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [3, 4, 5, 6]
assert slice(3, 3, []) == []
assert slice(2, 2, [0, 1, 2, 3, 4]) == []