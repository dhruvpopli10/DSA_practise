package prac02;
import java.util.*;
public class arradd {
    public static void main(String[] args) {
        int[] arr1={4,5};
        int[] arr2={4,5};
        int a=arr1.length;
        int b=arr2.length;
        int c=a+b;
        int[] c1=new int[c];
        System.arraycopy(arr1, 0, c1, 0, a);
        System.arraycopy(arr2, 0, c1, a, b);
        System.out.println(""+Arrays.toString(c1));

    }
}
