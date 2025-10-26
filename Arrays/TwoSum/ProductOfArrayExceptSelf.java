package Arrays.TwoSum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println("product of array except self : " + Arrays.toString(productExceptSelf(nums)));

        int[] nums1 = new int[]{-1, 1, 0, -3, 3};
        System.out.println("product of array except self : " + Arrays.toString(productExceptSelf(nums1)));
    }

    //without using extra space we can make use of same array to determine left product and then right
    //product.
    public static int[] productExceptSelf(int[] nums) {
        int resultantArr[] = new int[nums.length];

        //using same concept of left and right but using same memory.
        resultantArr[0] = 1;
        for (int i = 1; i <= nums.length - 1; i++) {
            resultantArr[i] = resultantArr[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct = nums[i + 1] * rightProduct;
            resultantArr[i] = resultantArr[i] * rightProduct;
        }
        return resultantArr;
    }

    //with o(n) but with extra space
    /*public static int[] productExceptSelf(int[] nums) {
        int leftProductArr[] = new int[nums.length];
        int rightProductArr[] = new int[nums.length];
        int resultantArr[] = new int[nums.length];

        leftProductArr[0] = 1;
        for (int i = 1; i <= nums.length - 1; i++) {
            leftProductArr[i] = leftProductArr[i - 1] * nums[i - 1];
        }

        rightProductArr[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProductArr[i] = rightProductArr[i + 1] * nums[i + 1];
        }

        //calculating the product by multiplying left and right
        for (int i = 0; i <= nums.length - 1; i++) {
            resultantArr[i] = leftProductArr[i] * rightProductArr[i];
        }
        return resultantArr;
    }*/

    //brute force with division
    /*public static int[] productExceptSelf(int[] nums) {
        int newArr[] = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            int intermediateProduct = 1;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i != j) {
                    intermediateProduct *= nums[j];
                }
            }
            newArr[i] = intermediateProduct;
        }
        return newArr;
    }*/
}
