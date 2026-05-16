package Arrays.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int nums[] = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println("Search in rotated sorted array : " + search(nums, 0));

        int nums1[] = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println("Search in rotated sorted array : " + search(nums1, 3));

        int nums2[] = new int[]{1};
        System.out.println("Search in rotated sorted array : " + search(nums2, 0));

        int nums3[] = new int[]{3, 1};
        System.out.println("Search in rotated sorted array : " + search(nums3, 1));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) { //left array is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // element is on sorted part, eliminating unsorted part
                } else {
                    left = mid + 1; // element is on unsorted part, eliminating sorted part
                }
            } else { //right is sorted
                if (target <= nums[right] && target > nums[mid]) {// it is on right sorted part
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
