public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
        reverse1(1234);
        int n = 123;
        int pow = (int) (Math.log10(n));// To get power of number original formula include -1 at end,but we want one power less.
        System.out.println(reverse2(n, pow));
        System.out.println(reverse3(n, 0));
    }

    //Using global variable and changing the values in that variable, without returning anything.
    static void reverse1(int n) {

        if (n == 0) {
            return;
        }
        sum = (sum * 10) + (n % 10);
        reverse1(n / 10);
    }

    static int reverse2(int n, int power) {
        double sum = 0;
        if (n == 0) {
            return 0;
        }

        sum = (n % 10) * Math.pow(10, power);
        int tsum = (int) sum;//typecasting
        return tsum + reverse2(n / 10, power - 1);
    }

    //Without using powers
    static int reverse3(int num, int sum) {
        if (num == 0)
            return sum;
        sum = sum * 10 + num % 10;
        return reverse3(num / 10, sum);
    }
}
