public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    static int fact(int no) {

        if (no <= 1) {
            return 1;
        }
        return no * fact(no - 1);
        //return fact(no-1);
    }
}
