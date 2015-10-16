package lists

//  P26 Generate the combinations of K distinct objects chosen from the N
//      elements of a list.
//      Example:
//      combinations(3, [1, 2, 3, 4, 5])
//      [[1, 2, 3], [1, 2, 4], [1, 2, 5], [1, 3, 4], [1, 3, 5], [1, 4, 5], [2, 3, 4], [2, 3, 5], [2, 4, 5], [3, 4, 5]]

// This solution was taken from Rosetta Code http://rosettacode.org/wiki/Combinations#Groovy
def comb
comb = { m, list ->
    def n = list.size()
    m == 0 ?
        [[]] :
        (0..(n-m)).inject([]) { newlist, k ->
            def sublist = (k+1 == n) ? [] : list[(k+1)..<n] 
            newlist += comb(m-1, sublist).collect { [list[k]] + it }
        }
}

assert comb(3, [1, 2, 3, 4, 5]) == [[1, 2, 3], [1, 2, 4], [1, 2, 5], [1, 3, 4], [1, 3, 5], [1, 4, 5], [2, 3, 4], [2, 3, 5], [2, 4, 5], [3, 4, 5]]
//assert comb(3, ['Jay', 'Thom', 'Matt', 'Kiko', 'Julia']) == [[Jay, Thom, Matt], [Jay, Thom, Kiko], [Jay, Thom, Julia], [Jay, Matt, Kiko], [Jay, Matt, Julia], [Jay, Kiko, Julia], [Thom, Matt, Kiko], [Thom, Matt, Julia], [Thom, Kiko, Julia], [Matt, Kiko, Julia]]