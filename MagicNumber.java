class HelloWorld {
    public static void main(String[] args) {
        int n = 3;
        int base = 5;
        int ans =0;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans+= last*base;
            base*=base;
        }
        System.out.println(ans);
    }
}
