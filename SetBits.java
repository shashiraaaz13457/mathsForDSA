public class SetBits {
    public static void main(String[] args) {
        //Method 1
        int n = 7;
        System.out.println(Integer.toBinaryString(n)); //This gives me bits in String.
        int count = 0;
//        while(n>0){
//            if((n & 1) == 1){
//                count++;
//            }
//            n = n >> 1;
//        }
//        System.out.println(count);

        //Method 2
        int last = (n & -n); //Rightmost bit you can also use (n & n-1)
        while(n > 0){
            n = n - last; // Difference of n - last bit
            n = n >> 1;
            count++;
        }
        System.out.println(count);

    }
}
