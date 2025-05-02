package prac02;
import java.util.*;
public class kth_smallest {
    static int ksmall(int arr[],int k){
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-k];
    }
    public static void main(String args[]){
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(ksmall(nums, k));
    }
}
