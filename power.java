import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int a =  2;
        int b =  2;
        int result = power(a,b);
        System.out.println(result);
    }
    private static int power(int a, int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        
        int ans = power(a, b/2);
        
        if(b%2==0){
            return ans*ans;
        }
        else{
            return a * ans * ans;
        }
    }
}
