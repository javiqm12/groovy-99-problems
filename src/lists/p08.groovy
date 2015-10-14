package lists

//  P08 Eliminate consecutive duplicates of list elements.
//  Example:
//      compress([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5])
//      [1, 2, 3, 1, 4, 5]

List compress(List ls) {
    List result = []
    for (int i = 0; i < ls.size(); i++) {
        result << ls[i]
        boolean duplicateFound = false
        int j = i + 1
        for (; j < ls.size() && ls[i] == ls[j]; j++)
            duplicateFound = true
        if (duplicateFound)
            i = j - 1
    }
    result
}

assert compress([1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5]) == [1, 2, 3, 1, 4, 5]
assert compress([]) == []
assert compress([5]) == [5]
assert compress([3,3]) == [3]
assert compress(['a','a']) == ['a']