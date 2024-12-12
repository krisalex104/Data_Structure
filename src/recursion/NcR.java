package recursion;

public class NcR {

    private static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (n == r || r == 0) {
            return 1;
        }
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    private static int nCR(int n, int r) {
        if (r > n) {
            return 0;
        }
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    private static int factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int nCr = nCr(2, 4);
        System.out.println(nCr);

        int nCR = nCR(5, 3);
        System.out.println(nCR);
    }
}
