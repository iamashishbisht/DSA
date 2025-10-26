package Arrays.ContainsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int nums[] = new int[]{1, 2, 3, 1};
        System.out.println("contains duplicate : " + containsDuplicate(nums));

        int nums1[] = new int[]{1, 2, 3, 4};
        System.out.println("contains duplicate : " + containsDuplicate(nums1));

        int nums2[] = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("contains duplicate : " + containsDuplicate(nums2));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    //for better memory
    /*public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }*/
}
