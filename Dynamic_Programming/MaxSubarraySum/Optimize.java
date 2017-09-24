package Dynamic_Programming.MaxSubarraySum;

import java.util.Scanner;

/**
 * Created by lmsj0 on 9/24/2017.
 */
public class Optimize {
    public static int kadane(int [] a ){
        int x = a[0];
        int y = a[0];
        for(int i = 1; i<a.length; i++){
            x = Math.max(a[i],x + a[i]);

            y = Math.max(y,x);
        }
        return y;
    }

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n ; i++){
           a[i] = input.nextInt();
        }

        System.out.print(kadane(a));
    }
}
