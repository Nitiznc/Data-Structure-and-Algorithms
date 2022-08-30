public class MyClass {
    public static void main(String args[]) {
      int num = 10;
      boolean name = isPerfectSquare(num);
      System.out.println(name);
    }
    static boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int start=2;
        int end=num/2;

        while(start<=end){
            int mid=start+(end-start)/2;
            long mul=(long) mid*mid;
            if(mul==num){
                return true;
            }
            else if(mul>num) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
