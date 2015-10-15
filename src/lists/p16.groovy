package lists

//  P16 Drop every Nth element from a list.
//  Example:
//      drop([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
//      [1, 2, 4, 5, 7, 8, 10, 11]

List drop(Integer n, List ls) {
    List result = []
    ls.eachWithIndex { e, i -> if ((i+1) % n != 0) result += e}
    result
}

List drop2(Integer n, List ls) {
    def result = ls.inject([1, []]) { s, e ->
        if (s[0] % n != 0) s[1] << e
        s[0] += 1
        s
    }
    result[1]
}

assert drop(2, [1, 2, 3, 4, 5]) == [1, 3, 5]
assert drop(2, ['a', 'b']) == ['a']
assert drop(2, []) == []

assert drop2(2, [1, 2, 3, 4, 5]) == [1, 3, 5]
