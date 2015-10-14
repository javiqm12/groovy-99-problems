package lists

//  P05 Reverse a list.
//  Example:
//      reverse([1, 1, 2, 3, 5, 8])
//      [8, 5, 3, 2, 1, 1]

// Using builtin methon List.reverse()
def reverse(List ls) {
    ls.reverse()
}

assert [8, 5, 3, 2, 1, 1] == reverse([1, 1, 2, 3, 5, 8])

List ls = [1,2,3,4,5]
def ls2 = ls.reverse()
assert ls == [1,2,3,4,5]
//println "ls =  $ls"
//println "ls2 = $ls2"