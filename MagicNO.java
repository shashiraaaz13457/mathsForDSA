public class MagicNO {
    public static void main(String[] args) {
        // We have to find 6th magic number.
        int n = 3;
        int ans = 0;
        // We are using 5 to the power so that's why base is 5.
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;

            base = base * 5;
        }
        System.out.println(ans);
    }
}
