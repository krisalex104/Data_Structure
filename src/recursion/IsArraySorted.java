package recursion;

public class IsArraySorted {

    public static boolean arraySortedOrNot(int []arr, int n){
        //You can code here

      boolean isSorted = true;
      for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
              isSorted = false;
              break;
          }
      }
    return isSorted;

    }

    public static void main(String[] args) {
    int arr[] ={1,2,3,5,4};
        System.out.println(arraySortedOrNot(arr,arr.length));
    }
}
