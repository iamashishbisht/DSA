package Arrays.MinInRotatedSortedArray;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {

        int nums[] = new int[]{3, 4, 5, 1, 2};
        System.out.println("Minimum in sorted array : " + findMin(nums));

        int nums1[] = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum in sorted array : " + findMin(nums1));
    }

    public static int findMin(int[] nums) {
        int globalMin = nums[0];
        int left = 0;
        int right = nums.length - 1;
        //int mid = (left + right) / 2;
        while (left <= right) {

            //int mid = (left + right) / 2;
            int mid = (left + right) / 2;

            System.out.println("left :" + left + " right : " + right + "mid : +" + mid);
            if (nums[left] <= nums[mid]) {
                //left will be sorted array in this case then
                globalMin = Math.min(globalMin, nums[left]);
                left = mid +1;
            } else{
//            if (nums[right] > nums[mid]) {
                //right is sorted in this case then
                globalMin = Math.min(globalMin, nums[mid]);
                right = mid-1;
            }
        }
        return globalMin;
    }
}
