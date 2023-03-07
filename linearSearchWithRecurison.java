import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length-1;
        int index = 0;
        int key = 30;
        boolean result = linearSearch(arr,index, len, key);
        System.out.println(result);
    }    
    private static boolean linearSearch(int[] arr,int index, int len, int key){
        if(index==len){
            return false;
        }
        if(arr[index++]==key){
            return true;
        }
        else{
            return linearSearch(arr, index, len, key);
        }
    }
}
