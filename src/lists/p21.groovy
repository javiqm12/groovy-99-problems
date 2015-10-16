package lists

//  P21 Insert an element at a given position into a list.
//      Example:
//      insertAt('hey', 2, ['a', 'b', 'c', 'd'])
//      ['a', 'b', 'hey', 'c', 'd']

List insertAt(element, Integer n, List ls) {
    ls.plus(n, element)
}

insertAt('hey', 2, ['a', 'b', 'c', 'd'])