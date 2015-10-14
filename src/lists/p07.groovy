package lists

//  P07 Flatten a nested list structure.
//  Example:
//      flatten([[1, 1], 2, [3, [5, 8]]])
//      [1, 1, 2, 3, 5, 8]

// Using builtin methon List.flatten()
List flatten(List ls) {
    ls.flatten()
}

assert flatten([[1, 1], 2, [3, [5, 8]]]) == [1, 1, 2, 3, 5, 8]
