package Dynamic_Programming.MaxSubarraySum;
/**
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 * Created by lmsj0 on 9/24/2017.
 */
public class Kadane_Algorithm {
    public static int kadane_algorithm(int []a){
        int y = Integer.MIN_VALUE;
        int x = 0;
        int start = 0;
        int end = 0;
        int k = 0;

        for(int i = 0; i< a.length; i++){
            x = x + a[i];
            if(y < x){
                y = x;
                start = k;
                end = i;
            }
            if(x < 0){
                x = 0;
                k = i + 1;
            }
        }
        System.out.println("start at " + start);
        System.out.println("end at " + end);
        return  y;
    }
    public static void main(String [] args){
        //Scanner input = new Scanner(System.in);
        int [] a = {-22,-31,-4,-16,-2,-91,-5,-3};
        System.out.print("Max contiguous sum is " + kadane_algorithm(a));
    }
}
