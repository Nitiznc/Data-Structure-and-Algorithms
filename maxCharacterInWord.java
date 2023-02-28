import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        String str = "output";
        char[] ch = str.toCharArray();
        int n = ch.length;
        int[] arr = new int[26];
        
        for(int j = 0 ; j<n ; j++){
            int num = 0;
            num = (int)(ch[j]-'a');
            arr[num]++;
        }
        int max = -1; 
        int ans = 0; 
        for(int i = 0 ; i < 26 ; i++){
            if(max<arr[i]){
                ans = i;
                max = arr[i];
            }
        }
        char result = (char)(ans+'a');
        System.out.println(result);
    }
}

// output:
// t
