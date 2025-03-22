public class Recursion3 {
    public static void printPerm(String str, String Permutation) {
        if (str.length() == 0) {
            System.out.println(Permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i); // Fixed method call
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, Permutation + currChar);
        }
    }

    public static void main(String[] args) {
        printPerm("abc", ""); // Removed System.out.println()
    }
}
