import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

    public static int[][] multipleLeftRotations(int[] A, int[] B) {
        // Initialize a 2D array for the result
        int[][] result = new int[B.length][A.length];

        for (int i = 0; i < B.length; i++) {
            int rotations = B[i] % A.length; // Handle cases where B[i] > A.length
            int[] tempArray = new int[A.length];

            copyArray(A, tempArray);
            rotateArray(tempArray, 0, rotations - 1);         // Reverse the first part
            rotateArray(tempArray, rotations, A.length - 1); // Reverse the second part
            rotateArray(tempArray, 0, A.length - 1);         // Reverse the whole array

            result[i] = tempArray; // Add the rotated array to the result
        }

        return result;
    }

    private static void copyArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    private static void rotateArray(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 2};
        int[][] ints = multipleLeftRotations(a, b);
        System.out.println(Arrays.deepToString(ints));
    }
}
