import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        String[] s1 = {"of"};
        String[] s2 = {"A","lot","of","words"};
        System.out.println(check(s1, s2));
    }
    public static boolean check(String[] s1, String[] s2){
        int i = 0, j = 0;
        while (i < s1.length && j < s2.length){
            if (!s1[i].equals(s2[j])) break;
            i++;
            j++;
        }
        if (i == s1.length || j == s2.length) {
            return true;
        }
        int len1 = s1.length - 1, len2 = s2.length - 1;
        while(len1 >= i && len2 >= j){
            if(!s1[len1].equals(s2[len2])) {
                return false;
            }
            len1--;
            len2--;
        }
        return len1 < i || len2 < j;
    }
}
