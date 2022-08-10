public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(2220));
    }

    static int sumOfDigits(int no) {

        if (no == 0) {
            return 0;
        }
        return no%10 + sumOfDigits( no/10);
        //return fact(no-1);
    }
}
