######
###f(n,w)=Max(f(n-1,w),vn+f(n-1,w-wn));
### f(n,j) = Max{f(n -1 , j - wi)  + vi(j >= wi) , f(n - 1 , j)}
#
#
#我们来分解下面几种情况

#当w为0时，即不管有几个石头，这个包什么都不能装，显然f(n,0)=0;
#当n为0时，即不管这个包能承重多少，没什么物品可选，显然f(0,w)=0;
#当w,n都不为0时，我们可以看看n-1的情况;
#当我们不把第n个物品放入背包时，背包的价值为f(n-1,w)
#当我们把第n个物品放入背包时，因为这个石头占了背包的承重，所以我们要解决的问题就是之前n-1个石头放入承重为w-wn的包的解,即此时背包的价值为vn+f(n-1,w-wn);
#我们分析了放与不放的情况，接下来我们就取两者的最大值做为解吧即f(n,w)=Max(f(n-1,w),vn+f(n-1,w-wn));
#
#

def bag(j,wi, vi, n):
    if (j == 0 or n == 0):
        return 0

    if (wi[n - 1] > j):
        return bag(j, wi, vi, n -1 )

    else:
        return max(bag ( j, wi, vi, n -1), vi[n -1] + bag (j - wi[n - 1], wi,vi, n-1))


vi = [60, 100, 120]
wi = [10, 20, 30]
j = 50
n = len(vi)
print(bag(j, wi, vi, n))

