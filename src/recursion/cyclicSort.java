package recursion;

public class cyclicSort {
    public static void main(String[] args) {

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Input:   " + java.util.Arrays.toString(nums));
        System.out.println("Missing: " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int idx = nums[i];
            if (nums[i] < n && nums[i] != i) {
                swap(nums, i, idx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return n;
    }

    private static void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}