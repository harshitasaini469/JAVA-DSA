import java.util.Arrays;

public class Array_insertion {
    public static void main(String[] args) {
        int a[] = { 2, 5, 1, 7, 9, 4, 8, 10 };

        // a = insert_at_beg(a, 6);
        // System.out.println(Arrays.toString(a));

        a = insert_at_pos(a, 3, 2);
        System.out.println(Arrays.toString(a));

    }

    static int[] insert_at_beg(int[] a, int n) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = n;
        return a;
    }

    static int[] insert_at_last(int[] a, int n) {

        return a;
    }

    static int[] insert_at_pos(int[] a, int n, int pos) {

        for (int i = a.length - 1; i >= pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = n;
        return a;
    }
}
