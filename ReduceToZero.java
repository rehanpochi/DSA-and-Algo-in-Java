// Leetcode problem no:1342 
public class ReduceToZero {
    public static void main(String[] args) {
        System.out.println(reduce(14));
    }

    static int reduce(int n) {
        int count = 0;
        if (n == 0) {
            return 0;
        }
        count++;
        if (n % 2 == 0) {
            return count + reduce(n / 2);
        } else {
            return count + reduce(n - 1);
        }
    }
}
