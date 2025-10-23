package Arrays.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("indexes are : " + Arrays.toString(twoSum(nums, target)));

        int nums1[] = new int[]{3, 2, 4};
        int target1 = 6;
        System.out.println("indexes are : " + Arrays.toString(twoSum(nums1, target1)));

        int nums2[] = new int[]{2, 7, 11, 15};
        int target2 = 9;
        System.out.println("indexes are : " + Arrays.toString(twoSum(nums2, target2)));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i =0; i <= nums.length-1; i++){
            int complementary = target - nums[i];
            if(hashMap.containsKey(complementary)){
                return new int[]{hashMap.get(complementary), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }

    //sort + two pointer will be applicable onlt=y to identify which are the two numbers that will give
    //traget value, but this soln is oncorrect as the index will change when we sort it
    /*public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println("input :"+Arrays.toString(nums));
        int j = nums.length - 1;
        for (int i = 0; i <= nums.length - 1;) {
            System.out.println("i :"+ i + " j : "+j);
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            } else if (i == j) {
                return new int[]{};
            }else if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            }
        }
        return new int[]{};
    }*/

    //O(n2)
    /*public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }*/
}
