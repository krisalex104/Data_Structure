package recursion;

public class JosephusProblem {

    public static int josephusForOneIndex(int n, int k)
    {
        //You can code here


        if (n == 1) {
            return 1; // Safe position in a 1-based index
        }

        // Recursively find the safe position for n-1 people, then adjust for the current circle
        return (josephusForOneIndex(n - 1, k) + k - 1) % n + 1;


    }

    public static int josephusForZeroIndex(int n, int k)
    {
        //You can code here


        if (n == 1) {
            return 0; // Safe position in a 0-based index
        }

        // Recursively find the safe position for n-1 people, then adjust for the current circle
        return (josephusForZeroIndex(n - 1, k) + k ) % n ;


    }


    public static void main(String[] args) {
        System.out.println(josephusForZeroIndex(5,3));
        System.out.println(josephusForOneIndex(5,3));
    }
}
