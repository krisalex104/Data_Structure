import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //You can code here
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2Helper(candidates, answer, new ArrayList<>(), target, 0);
        return answer;
    }

    public static void combinationSum2Helper(int[] candidates, List<List<Integer>> answer, List<Integer> curr, int target, int index) {
        //You can code here
        if(target==0){
            List<Integer> list=new ArrayList<>(curr);
            answer.add(list);
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target){
                return;
            }
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
         curr.add(candidates[i]);
         combinationSum2Helper(candidates,answer,curr,target-candidates[i],i+1);
         curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
       int []arr={1,4,2,6,9,2,1,4,2};
       int target=7;
        List<List<Integer>> lists = combinationSum2(arr, target);
        for(List<Integer> l:lists){
            for(Integer i: l){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
