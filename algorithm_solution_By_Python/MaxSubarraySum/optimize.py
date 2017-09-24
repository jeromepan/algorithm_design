

def kadane(a):

    x = a[0]
    y = a[0]

    for i in range(1,len(a)):

        y = max(a[i], y)
        x = max(y,x)

    return x

a = [-43,-3,-34,-4,42,0]
print("The maximum contiguous sum is " , kadane(a))


