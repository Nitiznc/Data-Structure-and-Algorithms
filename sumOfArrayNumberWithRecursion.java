import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length-1;
        int index = 0;
        int result = sum(arr,index, len);
        System.out.println(result);
    }    
    private static int sum(int[] arr,int index, int len){
        int sumOfNumber = 0;
        if(index==len){
            return arr[index];
        }
        sumOfNumber += arr[index] + sum(arr, ++index, len) ;
        return sumOfNumber;
    }
}
