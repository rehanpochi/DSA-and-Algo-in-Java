import java.util.ArrayList;

public class LinearSearchRecursion {
    //Adding searched numbers into arraylist
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1,4, 4, 56, 4,};
        int target = 4;
//        System.out.println(linearSearch(arr, 0, target));
//        findAllElements(arr, 0, target);
//        System.out.println(list);
//        System.out.println(findAllindexArrayList(arr, 0, target, new ArrayList<>()));
        System.out.println(giveArrayList(arr, 0, target));

    }

    public static int linearSearch(int[] arr, int index, int target) {
        //base condition
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, index + 1, target);
    }

    public static void findAllElements(int[] arr, int index, int target) {
        //base condition
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllElements(arr, index + 1, target);
    }
    //method 3 returning arraylist
    // In this the list gets updated because in each call the object is same just reference variables are different

    public static ArrayList<Integer> findAllindexArrayList(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllindexArrayList(arr, index + 1, target, list);

    }

    // Method 4 assigning arraylist inside the body, in this method the reference value is not same for a single object
    // Because we are creating arraylist everytime for every function call
    public static ArrayList<Integer> giveArrayList(int[] arr, int index, int target) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        if (index == arr.length) {
            return arrList;
        }
        if (arr[index] == target) {
            arrList.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = new ArrayList<>();
        ansFromBelowCalls = giveArrayList(arr, index + 1, target);
        arrList.addAll(ansFromBelowCalls);
        return arrList;
        // return (giveArrayList(arr, index + 1, target)).addAll(arrList);

    }

}
