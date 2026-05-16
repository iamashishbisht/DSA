package Arrays.TopKFrequentElements;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println("top k frequent elements : " + Arrays.toString(topKFrequent(nums, k)));

        int[] nums1 = new int[]{7, 7};
        int k1 = 1;

        System.out.println("top k frequent elements : " + Arrays.toString(topKFrequent(nums1, k1)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        //frequency map
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency map " + freqMap);

        //using bucket index as frequency and arrayList to hold those elements that have that much frequency
        List bucket[] = new ArrayList[nums.length + 1];

        for (int key : freqMap.keySet()) {
            List bucketlist = bucket[freqMap.get(key)] == null
                    ? new ArrayList<>()
                    : bucket[freqMap.get(key)];
            bucketlist.add(key);
            bucket[freqMap.get(key)] = bucketlist;
        }

        for (List i : bucket) {
            System.out.println("list is : " + i);
        }
        System.out.println("bucket :" + bucket);

        int kFrequentElementsArray[] = new int[k];
        int j = 0;
        for (int i = bucket.length - 1; i >= 0 || j < k; i--) {
            List<Integer> list = bucket[i];
            if (list == null) {
                continue;
            }
            for (int element : list) {
                if (j >= k) {
                    break;
                }
                kFrequentElementsArray[j] = element;
                j++;
            }
        }
        return kFrequentElementsArray;
    }
}
