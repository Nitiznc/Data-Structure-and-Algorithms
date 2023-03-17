// letter combinations of phone Number 

import java.util.*;
public class MyClass{
    public static void main (String[] arr){
        String digits = "23";
        List<String> list = letterCombinations(digits);
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()<=0){
            return list;
        }
        StringBuffer sb = new StringBuffer();
        int index = 0;
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, list, sb, index, mapping);
        return list;
    }
    private static void solve(String digits, List<String> list, StringBuffer sb, int index, String[] mapping){
        if(index>=digits.length()){
            list.add(sb.toString());
            return;
        }
        int num = digits.charAt(index) - '0';
        String value = mapping[num];

        for(int i = 0; i<value.length(); i++){
            sb.append(value.charAt(i));
            solve(digits, list, sb, index+1, mapping);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
