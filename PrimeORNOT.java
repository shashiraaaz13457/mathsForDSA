public class PrimeORNOT {
    public static void main(String[] args) {
        int n = 11;
//        System.out.println(isPrime(n));
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if (n == 1) {
            return false;
        }
        for (int i = 2; i*i <= n ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
