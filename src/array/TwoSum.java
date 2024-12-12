package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //You can code here
//        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
        twoSumHelper(nums,target,0,ans);
        int[] intArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            intArray[i] = ans.get(i);
        }
        return intArray;
    }

    private static void twoSumHelper(int arr[], int target, int startFrom , ArrayList<Integer> ans){
        int l=startFrom;
        int r=arr.length;

//        while(l<r){
//            if(arr[l]+arr[r-1]>target){
//                r--;
//            } else if (arr[l]+arr[r-1]<target) {
//                l++;
//            }else{
//           ans.add(l);
//           ans.add(r-1);
//           break;
//            }
//        }

        for(int i=0;i<arr.length-1;i++){
            boolean b=false;
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans.add(i);
                    ans.add(j);
                    b=true;
                    break;
                }
            }
            if(b){
                break;
            }
        }


    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for(int i : ints){
            System.out.print(i + " ");
        }
    }
}
