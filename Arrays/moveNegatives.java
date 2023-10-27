import java.util.*;

public class moveNegatives {
    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveNegativeElementsUsingTwoPointers(arr);
        moveNegativeElementsUsingDutchNationalFlag(arr);
    }

    public static void moveNegativeElementsUsingTwoPointers(int a[]) {

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {

            if (a[i] > 0 && a[j] < 0) {

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else if (a[i] < 0 && a[j] < 0) {
                i++;
            } else if (a[i] > 0 && a[j] > 0) {
                j--;
            } else {
                i++;
                j--;
            }

        }
        System.out.println(Arrays.toString(a));

    }

    public static void moveNegativeElementsUsingDutchNationalFlag(int a[]) {

        int low = 1;
        int hi = a.length - 1;

        while (low <= hi) {
            if (a[low] < 0) {
                low++;
            } else if (a[low] > 0) {
                int temp = a[low];
                a[low] = a[hi];
                a[hi] = temp;
                hi--;
                low++;
            }
        }

        System.out.println(Arrays.toString(a));

    }

}
