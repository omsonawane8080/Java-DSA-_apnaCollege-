// Print all even numbers till n.
package Lecture4;

import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Even numbers till " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
