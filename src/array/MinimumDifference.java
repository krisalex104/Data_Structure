package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {

    public static List<List< Integer>> minimumAbsDifference(int[] arr)
    {
        //You can code here
        Arrays.sort(arr);
        Integer min = Integer.MAX_VALUE;
        int n=arr.length;
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=1;i<n;i++){
           min=Math.min(min,arr[i]-arr[i-1]);
        }

        for(int i=1;i<n;i++){
           if(arr[i]-arr[i-1]==min){
             List<Integer> temp=new ArrayList<>();
             temp.add(arr[i-1]);
             temp.add(arr[i]);
             answer.add(temp);
            }
        }
    return answer;

    }

    public static void main(String[] args) {
        int a[] = {12, 9, 8, 2, 11, 5, 4, 5};
        List<List<Integer>> lists = minimumAbsDifference(a);
        System.out.println(lists);
    }
}
