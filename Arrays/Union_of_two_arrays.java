
// Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

import java.util.*;

public class Union_of_two_arrays {
    public static void main(String[] aStrings) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        int count = doUnion(a, a.length, b, b.length);
        System.out.println(count);

    }

    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here
        Set<Integer> unionSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }
        for (int j = 0; j < m; j++) {
            unionSet.add(b[j]);
        }
        return unionSet.size();

    }
}
