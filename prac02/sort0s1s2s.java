package prac02;

public class sort0s1s2s {
    static void sort(int num[]){
        int n=num.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++)
            if(num[i]==0)
                c0+=1;
            else if(num[i]==1)
                c1+=1;
            else
                c2+=1;
        int idx=0;
        for(int i=0;i<c0;i++)
            num[idx++]=0;
        for(int i=0;i<c1;i++)
            num[idx++]=1;
        for(int i=0;i<c2;i++)
            num[idx++]=2;
           
    }
    static void display(int[] nums){
        for(int i:nums){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int num[]={2,0,2,1,1,0};
        sort(num);
        display(num);
    }
}
