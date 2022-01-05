import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("Multidimensional Array");
        Scanner sc = new Scanner(System.in);
        /*
            Syntax of 2D Array
            int [][] arr = new int [size][size];
                                     row  col
                     */

//        int [] [] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };


        int[][] arr = new int [3][3];
        //Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();
            }
        }
        //Output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col]+ " " );
            }
            System.out.println("");
        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
