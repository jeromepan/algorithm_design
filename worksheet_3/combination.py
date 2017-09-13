
#For an n-bit binary number, there are 2^n
#combinations, as each digit can be either of the two options; 0 or 1. And theoretically, a state of every
#computational problems can be modelled as a sequence of binary digits.
#
#INPUT: The number of items to be picked, n.
#OUTPUT:
#All the combinations of n items.
#EXAMPLE
#INPUT
#3
#OUTPUT
#0 0 0
#0 0 1
#0 1 0
#0 1 1
#1 0 0
#1 0 1
#1 1 0
#1 1 1
#
#
n = input("input a number:")
n = int(n)
x = [0]*n

def conbination(cub):
    global x
    if cub == n:
        print(x)

    else:
        x[cub] = 0
        conbination(cub + 1)
        x[cub] = 1
        conbination(cub + 1)

conbination(0)


