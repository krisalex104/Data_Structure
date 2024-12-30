package backtracking;

import java.util.*;

public class SubSequenceOfArray {

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums) {

        //You can code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Collections.sort(nums);
        allSubsetHelper(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void allSubsetHelper(ArrayList<ArrayList<Integer>> answer, ArrayList<Integer> curr, ArrayList<Integer> nums, int index) {

        ArrayList<Integer> copy = new ArrayList<>(curr);
        answer.add(copy);

        for (int i = index; i < nums.size(); i++) {
            if (i > index && nums.get(i) == nums.get(i - 1)) {
                continue;
            }
            curr.add(nums.get(i));
            allSubsetHelper(answer, curr, nums, i + 1);
            curr.remove(curr.size() - 1);
        }


    }

    private static ArrayList<ArrayList<Integer>> getSubsetList(ArrayList<Integer> nums){
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        Collections.sort(nums);
        getSubsetListHelper(nums,0,curr,answer);
        Collections.sort(answer, (list1, list2) -> {
            // Compare element by element
            for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                int result = Integer.compare(list1.get(i), list2.get(i));
                if (result != 0) {
                    return result;
                }
            }
            return Integer.compare(list1.size(), list2.size());
        });
        return answer;
    }

    private static void getSubsetListHelper(ArrayList<Integer> nums,int index ,ArrayList<Integer> curr ,ArrayList<ArrayList<Integer>> answer){
        if(index>=nums.size()){
            ArrayList<Integer> copy=new ArrayList<>(curr);
            answer.add(copy);
            return;
        }

        curr.add(nums.get(index));
        getSubsetListHelper(nums,index+1,curr,answer);
        curr.remove(curr.size() - 1);
        getSubsetListHelper(nums,index+1,curr,answer);

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(8);
        ArrayList<ArrayList<Integer>> arrayLists = AllSubsets(arrayList);

        for (ArrayList<Integer> list : arrayLists) {
            System.out.println(list);
        }
        System.out.println("*******************");
        ArrayList<ArrayList<Integer>> subsetList = getSubsetList(arrayList);
        for (ArrayList<Integer> list : subsetList) {
            System.out.println(list);
        }
    }
}
