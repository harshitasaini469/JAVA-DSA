// Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

public class Max_Min {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -4, 5, 3 };
        int sum = findSum(arr, arr.length);
        System.out.println(sum);
    }

    public static int findSum(int A[], int N) {

        int min = findMin(A, N);
        int max = findMax(A, N);

        return min + max;
    }

    public static int findMin(int A[], int N) {
        int min = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public static int findMax(int A[], int N) {
        int max = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
}
