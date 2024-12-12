package recursion;

import java.util.*;

public class SubsetOfString {


    private static void subset(String s){

        subsetHelper(s,0,"");
    }

    private static void subsetHelper(String s,int index ,String curr){
        if(index==s.length()){
            System.out.println(curr);
            return;
        }

        subsetHelper(s,index+1,curr+s.charAt(index));
        subsetHelper(s,index+1,curr);
    }

    private static List<String> getSubsetList(String s){
       Set<String> set=new HashSet<>();
       getSubsetListHelper(s,0,"",set);

       return sorted(set);
    }

    private static List<String> sorted(Set<String> set){
        List<String> sorted =new ArrayList<>(set);
        sorted.sort(String::compareTo);
         sorted.remove("");
         return sorted;
    }

    private static void getSubsetListHelper(String s,int index ,String curr ,Set<String> set){
        if(index>=s.length()){
            set.add(curr);
            return;
        }

        getSubsetListHelper(s,index+1,curr+s.charAt(index),set);
        getSubsetListHelper(s,index+1,curr,set);

    }

    public static void main(String[] args) {
        String s="abcd";
        subset(s);
        List<String> subset = getSubsetList(s);
        System.out.println(subset);
    }
}
