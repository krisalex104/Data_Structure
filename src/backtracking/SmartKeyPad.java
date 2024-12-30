package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SmartKeyPad {

    public static List<String> letterCombinations(String digits) {
        //You can code here
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();
        letterCombinationHelper(map, 0, "", list,digits);
        return list;

    }

    private static void letterCombinationHelper(String[] map, int index, String curr, List<String> arr,String input) {
        if(index==input.length()){
            arr.add(curr);
            return ;
        }

        int keypadNumber=input.charAt(index) -'0';
        String keyPadString = map[keypadNumber];

        for(int i=0;i<keyPadString.length();i++){
            curr = curr+keyPadString.charAt(i);
            letterCombinationHelper(map,index+1,curr,arr,input);
            curr=curr.substring(0,curr.length()-1);
        }
    }


    public static void main(String[] args) {
     String digits="56";
        List<String> letterCombinations = letterCombinations(digits);
        System.out.println(letterCombinations);
    }
}
