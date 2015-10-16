package lists

//  P19 Rotate a list N places to the left.
//  Example:
//      rotate(3, [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
//      [3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1, 2]

List rotate(Integer n, List ls) {
    ls[n..-1] + ls[0..<n]
}

assert rotate(3,  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1, 2]
