package Lecture15;

public class CountOnes {
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13; // 1101 -> 3 ones
        System.out.println("Number of 1's in binary: " + countOnes(n));
    }
}

