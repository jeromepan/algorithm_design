package Dynamic_Programming.Fibonacci_numbers;

import java.util.Scanner;

/**we avoid the repeated work done is the recursive method by storing the Fibonacci numbers calculated so far.
 * Created by lmsj0 on 9/24/2017.
 */
public class Dynamic_Programming {
    public static int fib(int n){
        int f[] = new int[n+1];
        int i;


        f[0] = 0;
        f[1] = 1;

        for(i = 2; i<=n;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.print(fib(s));
    }

}

//Time Complexity: O(n)