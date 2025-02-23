package Lecture6;

public class InvertedHalfPyramid {
    public static void main(String args[]) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Printing numbers
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
