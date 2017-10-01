arr = [10,22,9,33,21,50,41,60,80]

def LIC(arr):
    if len(arr) == 0 or arr is None:
        return 0
    else:
        p =[1]*len(arr)
        for i in range(1,len(arr)):
            for j in range(i):
                if arr[i] > arr[j] and p[i] < p[j] +1:
                    p[i] = 1 + p[j]
        return max(p)

print(LIC(arr))


