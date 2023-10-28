public class second_largest {
    public static void main(String[] args) {
        int a[] = { 2, 5, 1, 7, 9, 4, 8, 10 };
        int n = a.length;
        int second_largest = secondLargest(a, n);
        System.out.println(second_largest);
    }

    static int secondLargest(int[] a, int n) {
        int max = a[0];
        int second_max = a[1];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                second_max = max;
                max = a[i];

            }
            if (a[i] < max && a[i] > second_max) {
                second_max = a[i];
            }
        }

        return second_max;
    }
}
