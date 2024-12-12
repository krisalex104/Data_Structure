package recursion;

public class Fibonacci {

    private static int findNthFibonnaciNumber(int n) {
        if (n <= 1) {
            return n;
        }

        return findNthFibonnaciNumber(n - 1) + findNthFibonnaciNumber(n - 2);
    }

    private static int findNthFibonnaci(int n) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }

        return c;
    }


    public static void main(String[] args) {
        int n = 5;
        int nthFibonnaciNumber = findNthFibonnaciNumber(n);
        System.out.println(nthFibonnaciNumber);

        int nthFibonnaci = findNthFibonnaci(n);
        System.out.println(nthFibonnaci);
    }
}
