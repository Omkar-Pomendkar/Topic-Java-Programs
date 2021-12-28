import java.util.Arrays;

public class PassininFunction {
    public static void main(String[] args) {
        System.out.println(" Array Passing in Function");
        int [] nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr)
    {
        arr[1] = 10;
    }
}
