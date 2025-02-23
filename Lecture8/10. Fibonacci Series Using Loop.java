package Lecture8;
import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}
