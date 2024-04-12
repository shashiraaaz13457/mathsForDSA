public class IsItPowerOf2 {
    public static void main(String[] args) {
        //Method 1
        int n = 0;
        int temp = n;
        int count = 0;
        while (n > 0){
            if((n&1) == 1){
                count++;
            }
            n = n >> 1;
        }
        if(count == 1){
            System.out.println(temp+" is power of 2");
        }else {
            System.out.println(temp +" is not power of 2");
        }

//        //Method2
//            if (n == 0){
//                System.out.println(n + " is not power of 2");
//                return;
//            }
//            if((n & (n-1)) == 0){
//                System.out.println(n +" is power of 2");
//                return;
//            }
//            else{
//                System.out.println(n +" is not power of 2");
//                return;
//            }
    }
}
