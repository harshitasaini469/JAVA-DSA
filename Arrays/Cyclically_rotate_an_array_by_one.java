// Given an array, rotate the array by one position in clock-wise direction.

import java.util.Arrays;

public class Cyclically_rotate_an_array_by_one {
    public static void main(String[] aStrings) {
        int[] arr = { 1, 2, 3, 4, 5 };
        arr = rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] rotate(int arr[], int n) {
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;

        return arr;
    }
}
