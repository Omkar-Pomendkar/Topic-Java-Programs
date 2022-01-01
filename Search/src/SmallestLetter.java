public class SmallestLetter {
    public static void main(String[] args) {
        char [] arr = {'c','d','f','j'};
        char target = 'j';
        int ans = smallestnumber(arr,target);
        System.out.println((char)ans);
    }

    static int smallestnumber(char[] arr, char target)
    {
        //but what if target is greater then last index
        //edge case

        int start = 0;
        int end = arr.length-1;

        while (start<=end)
        {
            int mid = start+(end-start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return arr[start % arr.length];
    }
}

