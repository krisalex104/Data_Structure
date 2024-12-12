package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Problem Statement
You are given an array of N integers, A1, A2 ,..., AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

Example 1:
Input:

A = [1, 3, -1]

Output:

5

Explanation:

f(1, 1) = f(2, 2) = f(3, 3) = 0

f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3

f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4

f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.

Example 2:
Input:

A = {3, -2, 5, -4}

Output:

10

Constraints:
1 <= |A| <= 105

-109 <= Ai <= 109
* */
public class MaximumAbsoluteDifference {

    public static int maxArr(ArrayList<Integer> A) {
        //You can code here
        int n=A.size();
        int minaipi=Integer.MAX_VALUE;
        int minaimi=Integer.MAX_VALUE;
        int maxaipi=Integer.MIN_VALUE;
        int maxaimi=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            minaipi = Math.min(minaipi, A.get(i) + i);
            maxaipi = Math.max(maxaipi, A.get(i) + i);

            minaimi = Math.min(minaimi, A.get(i) - i);
            maxaimi = Math.max(maxaimi, A.get(i) - i);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi, diffaimi);


    }
    public static void main(String[] args) {
        int a[] = {12, 9, 8, 2, 11, 5, 4, 5};

        ArrayList<Integer> input =new ArrayList<>();
        for(int i=0;i<a.length;i++){
            input.add(a[i]);
        }

        System.out.println(maxArr(input));
    }
}
