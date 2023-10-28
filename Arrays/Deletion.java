import java.util.Arrays;
import java.util.*;

public class Deletion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("enter elements in the array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("the arrays is " + Arrays.toString(a));

        System.out.println("enter the position to delete element");
        int pos = sc.nextInt();

        a = delete(a, pos);
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] +" ");
        }
        sc.close();

    }

    static int[] delete(int[] a, int pos) {

        for (int i = pos - 1; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        return a;
    }
}
