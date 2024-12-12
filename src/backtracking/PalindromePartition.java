import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    public static List<List<String>> partition(String s) {
        //You can code here
        List<List<String>> answer = new ArrayList<>();
        partitionHelper(s, answer, new ArrayList<>(), 0);
        return answer;

    }

    public static void partitionHelper(String s, List<List<String>> answer, List<String> curr, int index) {
        //You can code here
        if(index==s.length()){
            List<String> list=new ArrayList<>(curr);
            answer.add(list);
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrom(s,index,i)){
             curr.add(s.substring(index,i+1));
             partitionHelper(s,answer,curr,i+1);
             curr.remove(curr.size()-1);
            }
        }
    }

    public static boolean isPalindrom(String s,int index , int i){
        return isPalindromHelper(s,index,i);
    }

    public static boolean isPalindromHelper(String s,int l , int r){

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s= "aab";
        List<List<String>> partition = partition(s);
        for(List<String> list : partition){
            System.out.println(list);
        }
    }
}
