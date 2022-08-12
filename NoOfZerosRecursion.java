public class NoOfZerosRecursion {
    public static void main(String[] args) {
        int number = 2003;
        System.out.println(zeros(number));
    }

    static int zeros(int n) {
        int rem, count = 0;
        if (n == 0) {
            return count;
        }
        rem = n % 10;
        if (rem == 0) {
            count++;
        }
        return count + zeros(n / 10);
    }
}
