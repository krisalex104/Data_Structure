package recursion;

public class Power {

    private static int power(int base, int pow) {
        if (pow == 0)
            return 1;
        return base * power(base, pow - 1);
    }

    private static int fastPower(int base, int pow) {
        if (pow == 0)
            return 1;
        if (pow % 2 == 0) {
            return fastPower(base * base, pow / 2);
        } else {
            return base * fastPower(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        int power = power(3, 4);
        System.out.println(power);

        int fastPower = fastPower(2, 10);
        System.out.println(fastPower);
    }
}
