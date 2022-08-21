public class MyClass {
    public static void main(String args[]) {
        int[] arr = {-1,0,1,3,4,6,9,15,41,71};
        int target = 72;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            int mid = start + (end - start)/2;
            if(mid==target){
                return target;
            }
            else if(mid < target){
                start = mid+1;
            }
            else if(mid > target){
                end = mid-1;
            }
        }
        return -1;
    }
}
