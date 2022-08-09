public class BinarySearchRecursion {
    public static void main(String[] args) {
        int target;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        else if (target > arr[mid]) {
            return search(arr, target, start = mid + 1, end);
        }
        return search(arr, target, start, end = mid - 1);
    }
}
