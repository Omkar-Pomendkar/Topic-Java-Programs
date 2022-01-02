import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        //run the steps n times
        for (int i = 0; i < arr.length; i++) {
            //for each steps, max item will come at last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the item is smaller then previous
                if(arr[j] <arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                
            }

        }
    }


}
