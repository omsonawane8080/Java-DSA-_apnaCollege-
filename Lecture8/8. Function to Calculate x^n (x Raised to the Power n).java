package Lecture8;

import java.util.Scanner;

public class PowerFunction {
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int x = sc.nextInt(), n = sc.nextInt();
        System.out.println(x + "^" + n + " = " + power(x, n));
        sc.close();
    }
}
