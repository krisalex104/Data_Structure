package recursion;

public class OccurrencesOfString {

    private static int count(String s,String t){
    return countHelper(s,t,0);
    }
    private static int countHelper(String s,String t , int i){
        if(i>s.length()-t.length()){
            return 0;
        }
        int subProblemAnswer = countHelper(s, t, i+1);
        boolean doStartingCharacterMatch = s.substring(i,i+t.length()).equals(t);
        if(doStartingCharacterMatch){
            return subProblemAnswer+1;
        }
        return subProblemAnswer;

    }

    public static void main(String[] args) {
        String s ="ababab";
        String target ="aba";
        int count = count(s,target);
        System.out.println(count);
    }
}
