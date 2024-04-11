public class Ques1 {
    public static void main(String[] args) {
        // Finding Even Odd
        int n = 100;
        System.out.println(IsOdd(n));
    }
    static boolean IsOdd(int n){
        return (n & 1) == 1;
    }
}
