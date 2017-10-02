"""
by jerrypan 
A 1-metre wide pathway is to be covered with tiles. There are two types of tiles; white 1 x 1 metre2 and
black 1 x 2 metre2. Given that the pathway is L metres long, write a program that finds the number of all
the possible tile patterns for the pathway.
INPUT
The length of the pathway, L.
OUTPUT
The number of all the possible tile patterns for the pathway.

"""



L = (int)(input("input"))
memory = [None] + [None]*L
def path(L):
    if memory[L] == None:
        if L == 1:
            return 1
        else:
            if L == 2:
                return 2
            else:
                if L == 3:
                    return 4
                else:
                    memory[L] = path(L-1) + path(L-2) + path(L-3)
                    return memory[L]
    else:
        return memory[L]
print(path(L))

