package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateBrackets {

    public static List<String> AllParenthesis(int n) {
        //You can code here
        List<String> list = new ArrayList<>();
        generateValidParanthesis(0, n, 0, 0, "", list);
        return list;
    }

    private static void generateValidParanthesis(int i, int n, int open, int close, String curr, List<String> list) {
      if(i==2*n){
          list.add(curr);
          return;
      }

      if(open<n){
          curr =curr +'(';
          generateValidParanthesis(i+1,n,open+1,close,curr,list);
          curr=curr.substring(0,curr.length()-1);
      }

      if(close<open){
          curr =curr+')';
          generateValidParanthesis(i+1,n,open,close+1,curr,list);
      }

    }

    public static void main(String[] args) {
        List<String> strings = AllParenthesis(3);
        System.out.println(strings);
    }
}
