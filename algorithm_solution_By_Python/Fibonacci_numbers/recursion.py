"""
 * Created by lmsj0 on 9/24/2017.
 * Program for Fibonacci numbers
 The Fibonacci numbers are the numbers in the following integer sequence.

 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 Write a function int fib(int n) that returns Fn. For example, if n = 0, then fib() should return 0. If n = 1, then it should return 1. For n > 1, it should return Fn-1 + Fn-2
 """


def fib(a):
    if a == 0:
        return 0
    elif a == 1:
        return 1
    else:
        return fib(a-1) + fib(a-1)


print ("input a integer:")
n = int(input());
print(fib(n))

#Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
