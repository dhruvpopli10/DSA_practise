package prac02;
    //odd index->negative no.
    //even index->positive no.
import java.util.*;
public class rearrange {
    static void rearranges(ArrayList<Integer> arr){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
            if(arr.get(i)>=0)
                pos.add(arr.get(i));
            else
                neg.add(arr.get(i));
        int posidx=0,negidx=0;
        ArrayList<Integer> result=new ArrayList<>();
        int i=0;
        while(posidx<pos.size() && negidx<neg.size()){
            if(i%2==0)
                result.add(arr.set(i++,pos.get(posidx++)));
            else
                arr.set(i++,neg.get(negidx++));
        while(idx<pos.size()){
            System.out.print(idx++,"");
        }
       }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3, 1, -2, -5, 2, 4));
        rearranges(arr);
    }
}
