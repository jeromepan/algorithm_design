import sys
from decimal import Decimal
sys.setrecursionlimit(1000000)
print (sys.argv)
import time

n = input("input the coins ")
list = [int(y) for y in n.split()]
k = input("input the number of exchange")
v = (int)(k)

a = [None]*1000000
def change(v):
    if a[v] == None:
        if v == 0:
            a[v] = 0
        else:
            m = Decimal('Infinity')
            for i in  range(len(list)):
                if v >= list[i]:
                    m = min(m, change(v - list[i]) +1 )
            a[v] = m
    return a[v]

print (change(v))
