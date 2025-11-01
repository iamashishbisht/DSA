package Arrays.MaximumSubarray;

public class MaximumSubarray {
    public static void main(String[] args) {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("max subArray :" + maxSubArray(nums));

        int[] nums1 = new int[]{1};
        System.out.println("max subArray :" + maxSubArray(nums1));

        int[] nums2 = new int[]{5, 4, -1, 7, 8};
        System.out.println("max subArray :" + maxSubArray(nums2));
    }

    //kadane's algorithm to keep track of global max and current max
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
//        int startIndex = 0;
//        int endIndex = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
//                startIndex = i;
            } else {
                currentSum = currentSum + nums[i];
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
//                endIndex = i;
            }
        }
//        System.out.println("indexes of maximum subarray :" + startIndex + " , " + endIndex);
        return maxSum;
    }
}
