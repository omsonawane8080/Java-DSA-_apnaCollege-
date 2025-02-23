package Lecture15;

public class ToggleBit {
    public static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);
    }

    public static void main(String[] args) {
        int n = 5, pos = 1; // 5 = 101 -> Toggle bit at pos 1 -> 111 (7)
        System.out.println("Number after toggling bit at pos " + pos + ": " + toggleBit(n, pos));
    }
}
