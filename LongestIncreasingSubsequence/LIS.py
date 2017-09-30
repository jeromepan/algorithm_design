#set a array
arr = [-1000000] + [10, 22, 9, 33, 21, 50, 41, 60, 80]

#set a matrix
array = [[-1]*(len(arr) + 1) for i in range(len(arr) + 1)]

def LIS (i, j):
    if array[j][i] == -1:
        if i == len(arr) or j == len(arr):
            array[j][i] = 0
            return 0
        else:
            if arr[i] < arr[j]:
                array[j][i] = max(LIS(i, j+1), 1 + LIS(j, j+1))
                return array[j][i]
            else:
                array[j][i] = LIS(i, j+1)
                return array[j][i]
    else:
        return array[j][i]

print (LIS(0,1))
