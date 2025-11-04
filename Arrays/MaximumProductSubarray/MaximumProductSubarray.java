package Arrays.MaximumProductSubarray;


public class MaximumProductSubarray {

    public static void main(String[] args) {

        int nums[] = new int[]{2, 3, -2, 4};
        System.out.println("Max product is : " + maxProduct(nums));

        int nums0[] = new int[]{2, 3, -2, 4};
        System.out.println("Max product is : " + maxProduct(nums0));

        int nums1[] = new int[]{-2, 0, -1};
        System.out.println("Max product is : " + maxProduct(nums1));

        int nums2[] = new int[]{-2, 3, -4};
        System.out.println("Max product is : " + maxProduct(nums2));
    }

    //concept of prefix and suffix
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int prefixProduct = 1;
        int suffixProduct = 1;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (prefixProduct == 0) {
                prefixProduct = 1;
            }
            if (suffixProduct == 0) {
                suffixProduct = 1;
            }
            prefixProduct = prefixProduct * nums[i];
            suffixProduct = suffixProduct * nums[nums.length - 1 - i];
            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
            //System.out.println("index : "+ i + " element :"+ nums[i] + " prefixProduct : " + prefixProduct + " suffixProduct : " + suffixProduct + " maxProduct : " + maxProduct);
        }
        return maxProduct;
    }


    //modified Kadanes's algorithm
    /*public static int maxProduct(int[] nums) {
        int currentMaxProduct = nums[0];
        int currentMinProduct = nums[0];
        System.out.println("maxProd : "+currentMaxProduct + " minProd : "+currentMinProduct);
        int globalMax = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            //after multiplication the (currentMaxProduct, currentMinProduct) it max can be min, and min can be max
            currentMaxProduct = currentMaxProduct * nums[i];
            //using it because currentMaxProduct gets changes in between
            int tmpCurrMAx = currentMaxProduct;
            currentMinProduct = currentMinProduct * nums[i];

            currentMaxProduct = Math.max(Math.max(currentMaxProduct, currentMinProduct), nums[i]);
            currentMinProduct = Math.min(Math.min(tmpCurrMAx, currentMinProduct), nums[i]);
            System.out.println("maxProd : "+currentMaxProduct + " minProd : "+currentMinProduct);
            globalMax = Math.max(currentMaxProduct, globalMax);
        }

        return globalMax;
    }*/

    //brute force
    /*public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - 1; i++) {
            int product = 1;
            for(int j=i; j<= nums.length-1; j++){
                product  = product * nums[j];
                if(maxProduct < product){
                    maxProduct = product;
                }
            }
        }
        //int nums[] = new int[]{2, 3, -2, 4};
        return maxProduct;
    }*/
}
