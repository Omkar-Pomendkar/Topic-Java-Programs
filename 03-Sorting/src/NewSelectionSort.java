import java.util.Arrays;

public class NewSelectionSort {
    public static void main(String[] args) {
        System.out.println("Practicing Selection Sort");
        int [] arr = {4,5,3,2,1};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  select(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            //find the maximum element in an array & swap it with correct index
            int last = arr.length-i-1;
            int max = MaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr ,int first,int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }

    static int MaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }

        }
        return max;
    }
}
