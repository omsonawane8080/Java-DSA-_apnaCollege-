package Lecture6;

public class HollowRhombus {
    public static void main(String args[]) {
        int n = 5; // Size of rhombus

        for (int i = 1; i <= n; i++) {
            // Spaces before the first star
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing stars and spaces
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
