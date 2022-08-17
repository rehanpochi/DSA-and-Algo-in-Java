import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter array size");
    int size = in.nextInt();

    System.out.println("Enter array elements");
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
        arr[i] = in.nextInt();
    }

    System.out.println("Enter the number to search");
    int number = in.nextInt();

    System.out.println(Arrays.toString(searchRange(arr, number)));
}

    public static int[] searchRange(int[] nums,int target){
        int[] ans={-1,1};

        int start=search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    static int search(int[] nums, int target,boolean findStartIndex) {
        int start = 0;
        int ans=-1;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else  {
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
