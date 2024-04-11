public class NoOfDigit {
    public static void main(String[] args) {
        //Formula Method..
        int n = 10;
        int base = 2;
//
//        int ans = (int) (Math.log(n) / Math.log(base))+1;
//        System.out.println(ans);

        //Method 2
        int count = 0;
        while(n > 0){
            n = n >> 1;
            count++;
        }
        System.out.println(count);
    }
}
