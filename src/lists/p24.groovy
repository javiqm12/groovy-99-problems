package lists

//  P24 Lotto: Draw N different random numbers from the set 1..M.
//      Example:
//      lotto(6, 49)
//      [28, 13, 35, 11, 45, 22]

import lists.p23

List lotto(Integer count, Integer max) {
    p23.randomSelect(count, 1..max)
}

assert lotto(5, 49).size() == 5