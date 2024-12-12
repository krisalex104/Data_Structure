package backtracking;

public class PermutationOfArray {
    private static  void permute(int []arr, int left , int right){
        if(left==right){
            print(arr);
            return;
        }
        for(int i=left;i<=right;i++) {
            swap(arr, i, left);
            permute(arr, left+1, right);
            swap(arr, i, left);
        }
    }

    private static void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


    private static  void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        permute(arr,0,arr.length-1);
    }
}
