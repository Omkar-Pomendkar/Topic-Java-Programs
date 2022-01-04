import java.util.Arrays;

public class NewBubleSort {
    public static void main(String[] args) {
        System.out.println("Practicing Bubble Sort");
        int[] arr = {3,1,5,4,2};
        bubblesorts(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubblesorts(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 1; j < arr.length-i; j++) {
                 if(arr[j]<arr[j-1])
                 {
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] =  temp;
                 }

             }

         }
    }
}
