package recursion;

public class PowerModulo {

    /*
     *
     * (a+b)%m =(a%m + b%m) % m
     * (a*b)%m =(a%m * b%m) % m
     *
     * */

    private static int fastPower(int base, int pow, int modulo) {
        if (pow == 0)
            return 1;
        if (pow < 0)
            return fastPower(1 / base, Math.abs(pow), modulo);

        if (pow % 2 == 0) {
            return fastPower((base % modulo * base % modulo) % modulo, pow / 2, modulo);
        } else {
            return (base % modulo * fastPower(base, pow - 1, modulo) % modulo) % modulo;
        }
    }

    public static double myPow(double x, int n, int p) {
        //You can code here

        if (n == 0)
            return 1;

        if (n < 0)
            return myPow(1 / x, Math.abs(n), p);

        if (n % 2 == 0) {
            return myPow((x % p * x % p) % p, n / 2, p);
        } else {
            return (x % p * myPow(x, n - 1, p) % p) % p;
        }



    }

    public static void main(String[] args) {
        double fastPower = myPow(2.00000, 10, 500);
        System.out.println(fastPower);
    }
}
