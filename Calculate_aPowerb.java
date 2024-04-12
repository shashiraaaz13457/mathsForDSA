public class Calculate_aPowerb {
    public static void main(String[] args) {
        //Method 1
//        int a = 3;
//        int b = 6;
//        double ans = Math.pow(a,b);
//        System.out.println(ans);

        //Method 2
        int pow = 6;
        int base = 3;

        int ans = 1;
        while (pow > 0){
            int last = pow & 1;
            if(last == 1){
                ans = ans * base;
            }
            base = base * base;
            pow = pow >> 1;
        }
        System.out.println(ans);
    }
}
