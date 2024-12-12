import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerOneTwoThree {
    public static List<Integer> find123Digits(int[] arr, int n) {
        //You can code here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (checkInteger(arr[i])) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list);

        return list;
    }

    private static boolean checkInteger(int i) {
        String number = String.valueOf(i);
        if (number.contains("1") && number.contains("2") && number.contains("3")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {321, 123, 89, 32, 11};
        List<Integer> list = find123Digits(arr, arr.length);
        System.out.println(list);
    }
}
