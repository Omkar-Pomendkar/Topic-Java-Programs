public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {99, 89, 76, 65, 54, 44, 32, 10, 3, 1};
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;

        int ans = OrderAgnostic(arr, target);
        System.out.println(ans);
    }


    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find Whether Array is Sorted in Ascending or Descending
//         boolean isAsc;
//         if(arr[start] < arr[end])
//             isAsc = true;
//         else isAsc = false;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

        }
        return -1;

    }
}