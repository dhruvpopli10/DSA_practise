package prac02;
import java.util.*;
public class reaarange2 {
    static void arrange(int[] nums){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        for(int i=0;i<nums.length/2;i++){
            nums[i*2]=pos.get(i);
            nums[i*2+1]=neg.get(i);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        arrange(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
}
