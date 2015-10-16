package lists

//  P22 Create a list containing all integers within a given range.
//      Example:
//      range(3, 9)
//      [3, 4, 5, 6, 7, 8, 9]

List range(Integer start, Integer end) {
    start..end
}

assert range(3, 9) == [3, 4, 5, 6, 7, 8, 9]