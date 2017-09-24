#
#Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
def kadane(a):

    max_so_far =  -10000000
    max_ending = 0
    start = 0
    end = 0
    s = 0

    for i in  range(0,len(a)):
        max_ending = max_ending + a[i]
        if(max_so_far < max_ending):
            max_so_far = max_ending
            start = s
            end = i

        if max_ending < 0:
            max_ending = 0
            s = i + 1

    print( "start at ", start, "end at ", end)


    return max_so_far

a = [-13,-3,-25,-20,-3,-16,-23,-12,-5,-22,-15,-4,-7]
print ("Maximum contiguous sum is " , kadane(a))
