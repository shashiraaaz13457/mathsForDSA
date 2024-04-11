public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,9,4};
        System.out.println(UniqueElement(arr));
    }
    static int UniqueElement(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
