import java.util.Arrays;
import java.util.*;

public class Reverse {
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


        a = reverse(a);
        System.out.println("the arrays is " + Arrays.toString(a));
        
        sc.close();

    }

    static int[] reverse(int[] a) {

        int i=0;
        int j=a.length-1;

        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
}
