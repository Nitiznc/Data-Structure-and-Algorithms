import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        String str = "Hello What is your name";
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        StringBuffer newStr = separate(arr, sb);
        System.out.println(newStr);
        
    }
    private static StringBuffer separate(String[] arr,StringBuffer sb){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            String str = arr[i];
            String[] splitStr = str.split("");
            int start = 0;
            int end = splitStr.length-1;
            while(start<=end){
                String temp = splitStr[start];
                splitStr[start++] = splitStr[end];
                splitStr[end--] = temp;
            }
            for(int j = 0; j < splitStr.length; j++){
                sb.append(splitStr[j]);
            }
            sb.append(" ");
        }
        return sb;
    }
}

// output
// olleH tahW si ruoy eman
