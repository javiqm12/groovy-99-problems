package lists

//  P17 Split a list in two parts. The length of the first part is given.
//  Example:
//      split(3, [1, 2, 3, 4, 5, 6, 7])
//      [[1, 2, 3], [4, 5, 6, 7]]

List split(Integer n, List ls) {
    [ls[0..n-1]] << ls[n..-1]
}

assert split(3, [1, 2, 3, 4, 5, 6, 7]) == [[1, 2, 3], [4, 5, 6, 7]]
