package array;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        //You Can Code Here
        Collections.sort(A);

        for (int i = 1; i < A.size(); i = i + 2) {
            swap(A, i, i - 1);
        }
        return A;
    }

    private static void swap(ArrayList<Integer> a, int l, int r) {
        int temp = a.get(l);
        a.set(l,a.get(r));
        a.set(r,temp);
    }

    public static void main(String[] args) {
      ArrayList<Integer> a= new ArrayList<>();
      a.add(6);
      a.add(1);
      a.add(2);
      a.add(9);
      a.add(4);
      a.add(7);

        ArrayList<Integer> wave = wave(a);
        System.out.println(wave);

    }
}
