import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList<String> list  = new ArrayList<>();
        String output = "";
        String str = "abcdef";
        int start = 0;
        solve(list, output, str, start);
        System.out.println(list);
    }
    private static void solve(ArrayList<String> list, String output, String str, int start){
        if(start>=str.length()){
            if(output.length()!=0){
                list.add(output);
            }
            return ;
        }    
        
        // This part will work for exclude
        solve(list, output, str, start+1);
        
        char element = str.charAt(start);
        output = output+element;
        // This part will work for include 
        solve(list, output, str, start+1);
    }
}
