package prac02;
public class min_arr {
    static int minelem(int arr[],int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String args[]){
        int[] nums={3,4,5,6};
        int n=nums.length;
        System.out.println(minelem(nums, n));
    }
}
