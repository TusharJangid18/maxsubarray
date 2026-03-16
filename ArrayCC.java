import java.util.*;
public class ArrayCC {
    public static void maxsubarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefixsum[]=new int[numbers.length];
        prefixsum[0] =numbers[0];
        for(int i=1;i<prefixsum.length;i++){
            prefixsum[i]=prefixsum[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=start==0?prefixsum[end]:prefixsum[end]-prefixsum[start-1]; 
                if(maxsum<currsum){
                    maxsum=currsum; 
                }
            }
        }
        System.out.println("max sum is "+maxsum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxsubarray(numbers);
    }
}