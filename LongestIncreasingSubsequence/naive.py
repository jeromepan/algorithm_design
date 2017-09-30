arr = [10, 22, 9, 33, 21, 50, 41, 60, 80]

def LIS(arr):
    p =[None]*len(arr)
   # i = len(arr)
    for i in range (len(arr)):
        p[i] = 1
        for  j in range (0,i):
            if(arr[j]<=arr[i]):
                p[i] = max (p[i], p[j] +1)

        #print(i,arr[i], p[i])

    return  p[i]
#LIS(arr)
print(LIS(arr))
