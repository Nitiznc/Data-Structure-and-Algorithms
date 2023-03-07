import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {1,2,9,4,5,6,7};
        int len = arr.length-1;
        int index = 0;
        boolean result = isSorted(arr,index, len);
        System.out.println(result);
    }    
    private static boolean isSorted(int[] arr,int index, int len){
        if(index==len){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        else{
            return isSorted(arr,++index, len);
        }
    }
}
