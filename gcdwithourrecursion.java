import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        int num1 = src.nextInt();
        int num2 = src.nextInt();
        int num = gcd(num1, num2);
        System.out.println(num);
    }
    
    private static int gcd(int num1, int num2){
        if(num1==0){
            return num2;
        }
        if(num2==0){
            return num1;
        }
        while(num1!=num2){
            if(num1>num2){
                num1 -= num2;
            }
            else if(num2>num1){
                num2 -= num1;
            }
        }
        return num1;
    }
}
