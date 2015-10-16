package lists

//  P25 Generate a random permutation of the elements of a list.
//      Hint: Use the solution of problem P23.
//      Example:
//      randomPermute([1, 2, 3, 4, 5])
//      [2, 5, 3, 4, 1]

import lists.p23

List randomPermute(List ls) {
    p23.randomSelect(ls.size(), ls)
}

assert randomPermute((1..49).toList()).size() == 49