package lists

//  P06 Find out whether a list is palindrome.
//  Example:
//      isPalindrome([1, 2, 3, 2, 1])
//      true

// Using builtin methon List.reverse()
def isPalindrome(List ls) {
    ls == ls.reverse()
}

assert isPalindrome([1, 2, 3, 2, 1])
assert isPalindrome([1, 2, 2, 1])
assert isPalindrome([])
assert !isPalindrome([1, 2, 3, 4, 5])

//println "[].reverse() = ${[].reverse()}"