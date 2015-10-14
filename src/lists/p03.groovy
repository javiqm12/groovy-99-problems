package lists

//  P03 Find the Kth element of a list.
//      By convention, the first element in the list is element 0.
//  Example:
//      nth(2, [1, 1, 2, 3, 5, 8])
//      2

def nth(n, List ls) {
    ls[n]
}

assert 2 == nth(2, [1, 1, 2, 3, 5, 8])
