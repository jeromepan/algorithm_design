package Dynamic_Programming;

/**
 * Created by lmsj0 on 9/21/2017.
 */
public class printing_Longest_Common_Subsequence {
    static void lcs(String x,String y, int m, int n){
        int [][] L = new int [m+1][n+1];

        for(int i = 0; i<=m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j== 0)
                    L[i][j] = 0;
                else if(x.charAt(i - 1) == y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
            }
        }

        int index = L[m][n];
        int temp = index;

        char[]lcs = new char[index + 1];
        lcs[index] = '\0';

        int i = m, j = n;
        while(i > 0 && j > 0){
            if(x.charAt(i-1) == y.charAt(j-1)){
                lcs[index -1] = x.charAt(i-1);

                i--;
                j--;
                index--;
            }else if(L[i-1][j] > L[i][j -1])
                i--;
            else
                j--;

        }

        System.out.print("LCS of " +x+ "and " +y+ " is ");
        for(int k = 0; k<= temp; k++){
            System.out.print(lcs[k]);
        }
    }

    public static void main(String [] args){
        String x = "AGGTAB";
        String y = "GXTXAYB";
        int m =  x.length();
        int n = y.length();
        lcs(x,y,m,n);
    }

}
