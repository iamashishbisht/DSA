package Arrays.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        System.out.println("3 sum : " + (threeSum(nums)));

        int[] nums1 = new int[]{0, 1, 1};

        System.out.println("3 sum : " + (threeSum(nums1)));

        int[] nums2 = new int[]{0, 0, 0};

        System.out.println("3 sum : " + (threeSum(nums2)));

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        //sorting so that 2 pointers can be applied
        Arrays.sort(nums);

        List<List<Integer>> tripletList = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    tripletList.add(List.of(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return tripletList;
    }
}
