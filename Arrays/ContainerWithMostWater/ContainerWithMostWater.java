package Arrays.ContainerWithMostWater;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] nums = new int[]{-1, 7, 2, 5, 4, 7, 3, 6};

        System.out.println("Container With Most Water: " + (maxArea(nums)));

        int[] nums1 = new int[]{2, 2, 2};

        System.out.println("Container With Most Water: " + (maxArea(nums1)));

    }

    public static int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentArea = Math.min(heights[left], heights[right]) * width;
            maxArea = Math.max(maxArea, currentArea);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
