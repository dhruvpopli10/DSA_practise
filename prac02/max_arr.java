package prac02;
public class max_arr {
    static int maxele(int arr[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void main(String args[]){
        int num[]={6,7,8};
        int n=num.length;
        System.out.println(maxele(num, n));
    }
}
