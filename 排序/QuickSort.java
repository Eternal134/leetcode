import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int l = left, r = right, base = nums[left];
        while (l < r) {
            while (l < r && base <= nums[r]) {r --;}
            nums[l] = nums[r];
            while (l < r && base >= nums[l]) {l ++;}
            nums[r] = nums[l];
        }
        nums[l] = base;
        quickSort(nums, 0, l - 1);
        quickSort(nums, l + 1, right);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,2,3,10,6,1,9,7,8,4};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
