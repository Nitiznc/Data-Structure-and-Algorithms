import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      int[] arr = {1,3,4};
      List<List<Integer>> list = subsets(arr);
      System.out.println(list);
    }
    
    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(nums, 0, new ArrayList<>(), list);
        return list;
    }
    public static void generateSubsets(int[] nums, int start, List<Integer>curr, List<List<Integer>> list ){
        list.add(new ArrayList<>(curr));
        for(int i = start; i<nums.length; i++){
            curr.add(nums[i]);
            generateSubsets(nums, i+1, curr, list);
            curr.remove(curr.size()-1);
        }
    }
}
