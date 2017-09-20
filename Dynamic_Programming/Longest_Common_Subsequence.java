package Dynamic_Programming;

import java.util.LongSummaryStatistics;

/**THIS IS A PROBLEM ON GEEKSFORGEEKS SET 4 DYNAMIC PROGRAMMING
 * 1) Optimal Substructure:
 Let the input sequences be X[0..m-1] and Y[0..n-1] of lengths m and n respectively. And let L(X[0..m-1], Y[0..n-1]) be the length of LCS of the two sequences X and Y. Following is the recursive definition of L(X[0..m-1], Y[0..n-1]).

 If last characters of both sequences match (or X[m-1] == Y[n-1]) then
 L(X[0..m-1], Y[0..n-1]) = 1 + L(X[0..m-2], Y[0..n-2])

 If last characters of both sequences do not match (or X[m-1] != Y[n-1]) then
 L(X[0..m-1], Y[0..n-1]) = MAX ( L(X[0..m-2], Y[0..n-1]), L(X[0..m-1], Y[0..n-2])

 Examples:
 1) Consider the input strings “AGGTAB” and “GXTXAYB”. Last characters match for the strings. So length of LCS can be written as:
 L(“AGGTAB”, “GXTXAYB”) = 1 + L(“AGGTA”, “GXTXAY”)
 * Created by lmsj0 on 9/21/2017.
 */

//this is the naive recusive implementation of LCS programming || this code is contributed by Kumar.
/*
THIS IS an optimal substructure.
 */

public class Longest_Common_Subsequence {

    int lcs(char [] X, char [] Y, int m, int n){
        if(m == 0 || n == 0){
            return  0;
        } else if (X[m - 1] == Y[n-1]) {
            return  1 + lcs(X,Y,m-1,n-1);
        }else{
            return max(lcs(X,Y,m,n-1), lcs(X, Y, m-1,n));
        }
    }

    int max(int a, int b){
        return (a > b) ? a : b;
    }


    public static void main(String [] args){
        Longest_Common_Subsequence lcs = new Longest_Common_Subsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is " + " " + lcs.lcs(X, Y, m, n));
    }

}
