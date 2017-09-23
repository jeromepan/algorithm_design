#we avoid the repeated work done is the recursive method by storing the Fibonacci numbers calculated so far.
list = [0,1]
def fib(n):
    if n == 0:
        return 0
    elif n<= len(list):
        return list[n-1]
    else:
        temp = fib(n-1) + fib(n-2)
        list.append(temp)
        return temp

s = int (input("input an integer: "))
print (fib(s))

#Time Complexity: O(n)
