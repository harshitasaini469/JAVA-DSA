// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void main(String[] aStrings) {
        int[] arr = { 0, 2, 1, 2, 0 };
        arr = sort012(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] sort012(int a[], int n) {
        // code here
        // Dutch national flag problem
        int low = 0, mid = 0, temp = 0;
        int hi = n - 1;

        while (mid <= hi) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[hi];
                    a[hi] = a[mid];
                    a[mid] = temp;
                    hi--;
                    break;
            }
        }

        return a;

    }

}
