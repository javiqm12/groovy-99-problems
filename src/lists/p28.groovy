package lists

//  P28 Sorting a list of lists according to length of sublists.
//      Example:
//      lsort([[1,2,3], [4,5], [6,7,8], [4,5], [11]])
//      [[11], [4, 5], [4, 5], [1, 2, 3], [6, 7, 8]]

List lsort(List ls) {
    ls.sort { it.size() }
}

assert lsort([[1,2,3], [4,5], [6,7,8], [4,5], [11]]) == [[11], [4, 5], [4, 5], [1, 2, 3], [6, 7, 8]]