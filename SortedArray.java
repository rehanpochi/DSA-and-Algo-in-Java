public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 7};
        System.out.println(isSorted(arr, 0));

    }

    static boolean isSorted(int[] a, int index) {
        //base condition
        if (index == a.length - 1) {
            return true;
        }
        if (a[index] > a[index + 1]) {
            return false;
        }
        return isSorted(a, index + 1);
    }
}
