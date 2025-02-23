package Lecture8;
import java.util.Scanner;

public class GCDCalculator {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println("GCD: " + gcd(x, y));
        sc.close();
    }
}
