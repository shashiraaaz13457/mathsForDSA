public class Ques4 {
    //Doubt
    public static void main(String[] args) {
        int n = 7;
        System.out.println(FindIBit(n,1));
    }
    static int FindIBit(int n,int bitIndex){
        return (n & (1 << (n-1))) != 0 ? 1 : 0;
    }
}
