package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PermutationOfAnArray {
    public static List<List<Integer>> permute(int[] nums) {
        //You can code here
        List<List<Integer>>  arrayList = new ArrayList<>();
        permute(nums,0,nums.length-1,arrayList);
        Collections.sort(arrayList, (list1, list2) -> {
            // Compare element by element
            for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                int result = Integer.compare(list1.get(i), list2.get(i));
                if (result != 0) {
                    return result;
                }
            }
            return Integer.compare(list1.size(), list2.size());
        });
        return arrayList;

    }

    private static  void permute(int []arr, int left , int right, List<List<Integer>>  arrayList){
        if(left==right){
            List<Integer> arr2= new ArrayList<>(arr.length);
            copyArray(arr,arr2);
            arrayList.add(arr2);
            return;
        }
        for(int i=left;i<=right;i++) {
            swap(arr, i, left);
            permute(arr, left+1, right,arrayList);
            swap(arr, i, left);
        }
    }

    private static void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    private static void copyArray(int arr1[],List<Integer> arr2){
        for(int i=0;i<arr1.length;i++){
            arr2.add(i,arr1[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> answer = permute(arr);

        for(List<Integer> a:answer){
            System.out.println(a);
        }

    }
}
