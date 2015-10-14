package lists

//  P01 Find the last element of a list.
//  Example:
//      last([1, 1, 2, 3, 5, 8])
//      8

// Using builtin methon List.last()
def last(List ls) {
    ls.last()
}

assert 8 == last([1, 1, 2, 3, 5, 8])

def lastRecursive(List ls) {
    def head = ls?.head()
    def tail = ls?.tail()
    if (!head) throw new NoSuchElementException()
    else if (head && !tail) head
    else if (tail) lastRecursive(tail)
}

assert 8 == lastRecursive([1, 1, 2, 3, 5, 8])
assert 1 == lastRecursive([1])
try {
    lastRecursive([])
} catch (NoSuchElementException ex) {}
