public class Arrays1 {
    public static void main(String[] args) {
        System.out.println("What is Array");

        /*
                Array is a dataStructure collection of similar (int) data/Objects
         */

//        Syntax of Array
//        datatype array_name [] = new datatype[size];

        // Array Declaration
//            int arr[] ;

        // Array Initialization
//            arr[] = {10,20,30,40,50};
//            index =   0  1  2  3  4

        // Array Creation
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        System.out.println(arr[0]);

        //Printing Array using For Loop
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
