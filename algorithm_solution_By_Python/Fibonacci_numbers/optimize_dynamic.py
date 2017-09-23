#opimize the space used in dyamic programming by storing the previous two numbers noly because that is all we need to get the next fabonacci bumber in series

def fib(n):
    a = 0
    b = 1
    if n == 0:
        return a
    elif n == 1:
        return  b
    else:
        for i in range(2,n):
            c = a + b
            b = c
            a = b
        return b

s = int(input("input an integer:"))
print (fib(s))

#Time Complexity: O(n)
#Extra Space: O(1)
