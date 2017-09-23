package Dynamic_Programming.Fibonacci_numbers;

import java.util.Scanner;

/**
 * Created by lmsj0 on 9/24/2017.
 * Program for Fibonacci numbers
 The Fibonacci numbers are the numbers in the following integer sequence.

 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 Write a function int fib(int n) that returns Fn. For example, if n = 0, then fib() should return 0. If n = 1, then it should return 1. For n > 1, it should return Fn-1 + Fn-2
 */
public class recursion {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.print(fib(s));

    }

    public static int fib(int n){
        if(n == 0){
            return 0;
        }else if( n == 1){
            return  1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
}
