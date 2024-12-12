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

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        ArrayList<ArrayList<Integer>> arrayLists = AllSubsets(arrayList);

        for (ArrayList<Integer> list : arrayLists) {
            System.out.println(list);
        }
    }
}
