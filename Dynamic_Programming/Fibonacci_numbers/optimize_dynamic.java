package Dynamic_Programming.Fibonacci_numbers;

import java.util.Scanner;

/**
 * opimize the space used in dyamic programming by storing the previous two numbers noly because that is all we need to get the next fabonacci bumber in series
 * Created by lmsj0 on 9/24/2017.
 */
public class optimize_dynamic {
    public static int fib(int n){
        int a = 0;
        int b = 1;
        int c;

        if(n == 0){
            return 0;
        }
        for(int i = 2; i<=n; i++){
            c = a + b;
            b = c;
            a = b;
        }
        return b;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.print(fib(s));
    }
}

//#Time Complexity: O(n)
//Extra Space: O(1)
