import java.util.Scanner;

public class PalindromeNo {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(isPalindrome(input));

    }

    static boolean isPalindrome(int x) {
        int original = x;
        int sum = 0;
        while (x > 0) {
            int rem = x % 10;
            sum = (sum * 10) + rem;
            x = x / 10;
        }
        return original == sum;
    }
}
