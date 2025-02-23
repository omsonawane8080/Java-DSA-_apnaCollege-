package Lecture6;

public class HalfPyramid {
    public static void main(String args[]) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
