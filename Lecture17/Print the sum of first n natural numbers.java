public class Recursion {
    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        printSum(n - 1, sum + n);
    }

    public static void main(String[] args) {
        printSum(5, 0);
    }
}
