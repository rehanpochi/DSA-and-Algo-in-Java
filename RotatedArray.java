public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 4, 5, 6};
        int target = 1;
        System.out.println(rotatedBinary(arr, target, 0, arr.length - 1));
        System.out.println(search(arr, target));
    }

    static int rotatedBinary(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + end;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedBinary(arr, target, start, mid - 1);
            } else return rotatedBinary(arr, target, mid + 1, end);
        } else if (target > arr[mid] && target <= arr[end]) {
            return rotatedBinary(arr, target, mid + 1, end);
        } else return rotatedBinary(arr, target, start, mid - 1);

    }

    static int search(int[] a, int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target)
                return mid;
// the left side is sorted
            if (a[low] <= a[mid]) {
                if (target >= a[low] && target <= a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= a[mid] && target <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}