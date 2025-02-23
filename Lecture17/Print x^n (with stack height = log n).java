public class Recursion {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = printPower(x, n / 2);
        int fullPower = halfPower * halfPower;

        if (n % 2 != 0) {
            fullPower *= x;
        }
        return fullPower;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(printPower(x, n));
    }
}
