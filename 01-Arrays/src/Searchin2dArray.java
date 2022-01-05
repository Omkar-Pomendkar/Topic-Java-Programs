import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {2,3,4,5},
                {6,7,8,9},
                {10,11,12}
        };
        int target = 12;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int min(int [][] arr)
    {       int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] < min)
                {
                    min = arr[row][col];
                }

            }

        }
        return min;
    }

    static int max(int [][] arr)
    {       int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] > max)
                {
                   max = arr[row][col];
                }

            }

        }
        return max;
    }


    static int[] search(int [][] arr,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] == target)
                {
                    return new int[]{row,col} ;
                }

            }

        }
        return new int[]{-1,-1} ;
    }

}
