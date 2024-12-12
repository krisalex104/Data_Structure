package array;

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

    public static int[][] multipleLeftRotations2(int[] A, int[] B) {
        int[][] result = new int[B.length][A.length];

        for (int i = 0; i < B.length; i++) {
            int rotations = B[i] % A.length;
            int[] tempArray = new int[A.length];

            copyArray(A, tempArray);
            rotateArrayByK(tempArray,rotations);
            result[i]=tempArray;
        }

        return result;
    }

    public static int[][] multipleLeftRotations3(int[] A, int[] B) {
        int[][] result = new int[B.length][A.length];
        int n=A.length;
        int[] tempArray = new int[2*n];
        for(int i=0;i<n;i++){
            tempArray[i]=A[i];
            tempArray[n+i]=A[i];
        }

        for (int i = 0; i < B.length; i++) {
            int rotations = B[i] % A.length;
            for(int j=0;j<n;j++){
                result[i][j]=tempArray[j+rotations];
            }
        }

        return result;
    }

    public static int[][] multipleRightRotations(int[] A, int[] B) {
        int[][] result = new int[B.length][A.length];
        int n=A.length;
        int[] tempArray = new int[2*n];
        for(int i=0;i<n;i++){
            tempArray[i]=A[i];
            tempArray[n+i]=A[i];
        }

        for (int i = 0; i < B.length; i++) {
            int rotations = n-B[i] % A.length;
            for(int j=0;j<n;j++){
                result[i][j]=tempArray[j+rotations];
            }
        }

        return result;
    }

    private static void rotateArrayByK(int[] a, int k){
        int n=a.length;
        for(int i=0;i<k;i++){
            int temp=a[i];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
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

        System.out.println("******************************");
        int[] c = {1, 2, 3, 4, 5};
        int[][] multipleLeftRotations2 = multipleLeftRotations2(c, b);
        System.out.println(Arrays.deepToString(multipleLeftRotations2));

        System.out.println("******************************");
        int[] d = {1, 2, 3, 4, 5};
        int[][] multipleLeftRotations3 = multipleLeftRotations3(d, b);
        System.out.println(Arrays.deepToString(multipleLeftRotations3));

        System.out.println("******************************");
        int[] e = {1, 2, 3, 4, 5};
        int[][] multipleRightRotations = multipleRightRotations(e, b);
        System.out.println(Arrays.deepToString(multipleRightRotations));

    }
}
