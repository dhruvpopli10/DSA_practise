package prac02;
import java.util.*;
public class negativearr {
    static void negative(int arr[]){
        Arrays.sort(arr);
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={-12,11,-13,-5,6,-7,5,-3,-6};
        rearrange(arr);
        display(arr);
    }

    }
}
