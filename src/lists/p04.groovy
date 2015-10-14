package lists

//  P04 Find the number of elements of a list.
//  Example:
//      length([1, 1, 2, 3, 5, 8])
//      6

// Using builtin methon List.size()
def length(List ls) {
    ls.size()
}

assert 6 == length([1, 1, 2, 3, 5, 8])
