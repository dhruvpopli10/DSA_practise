package prac01;
public class reversearr{
    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    static void reversing(int arr[]){
        int[] temp=new int[4];
        for(int i=0;i<=arr.length-1;i++){
            temp[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String args[]){
        int[] num={4,5,6};
        reversing(num);
        display(num);
    }
}