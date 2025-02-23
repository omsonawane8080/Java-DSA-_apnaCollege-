public class Recursion {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * printPower(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(printPower(x, n));
    }
}

