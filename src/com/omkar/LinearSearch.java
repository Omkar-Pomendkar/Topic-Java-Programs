package com.omkar;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr,int target) {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = target;
            if(element == arr[i])
            {
                return i;
            }

        }
        return -1;
    }
}
