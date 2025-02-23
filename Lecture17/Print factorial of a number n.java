public class Recursion {
    public static void printFactorial(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }
        printFactorial(n - 1, fact * n);
    }

    public static void main(String[] args) {
        printFactorial(5, 1);
    }
}
