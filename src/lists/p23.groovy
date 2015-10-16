package lists

//  P23 Extract a given number of randomly selected elements from a list.
//      Example:
//      randomSelect(3, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
//      [8, 3, 5]

static List randomSelect(Integer n, List ls) {
    Random random = new Random()
    List result = []
    (1..n).each {
        result += ls[random.nextInt(ls.size())]
    }
    result
}

assert randomSelect(3, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).size() == 3