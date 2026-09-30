package Bits.NumberOf1Bits;

public class NumberOf1Bits {

    public static void main(String[] args) {

        int nums = 11;
        System.out.println("Number of 1 bits: " + hammingWeight(nums));

        int nums1 = 128;
        System.out.println("Number of 1 bits : " + hammingWeight(nums1));

        //recommended one
        System.out.println("Number of 1 bits: " + hammingWeight1(nums));

        System.out.println("Number of 1 bits : " + hammingWeight1(nums1));

        System.out.println("Number of 1 bits: " + hammingWeight2(nums));

        System.out.println("Number of 1 bits : " + hammingWeight2(nums1));

        System.out.println("Number of 1 bits: " + hammingWeight3(nums));

        System.out.println("Number of 1 bits : " + hammingWeight3(nums1));

    }

    public static int hammingWeight(int n) {
        int numberOf1Bits = 0;
        int value = 1;
        // n -> 1011 value -> 0001   1011 & 0001 -> 0000 (at the last bit when ending it with 0001 gives 0 means that at that position there is no 1 bit)
        // after checking the first bit from the end, left shift the  bit so that we can check for second last no. from the end ending it and so on one by one.
        for (int i = 0; i < n; i++) {
            if ((n & value) != 0) {
                numberOf1Bits++;
            }
            value = value << 1;
        }
        return numberOf1Bits;
    }

    public static int hammingWeight1(int n) {
        int numberOf1Bits = 0;
        // reason of anding n and n-1 is in bit format the difference used to be the last significant 1 bit, in n if it is 1 then in n-1 it will be 0, when ending it will make the LSB 1 bit as 0
        while (n != 0) {
            n = n & (n - 1);
            numberOf1Bits++;
        }
        return numberOf1Bits;
    }

    public static int hammingWeight2(int n) {
        String binayValue = Integer.toBinaryString(n);
        int numberOf1Bits = 0;
        for (int i = 0; i < binayValue.length(); i++) {
            if (binayValue.charAt(i) == '1') {
                numberOf1Bits++;
            }
        }
        return numberOf1Bits;
    }

    public static int hammingWeight3(int n) {
        int numberOf1Bits = 0;
        while (true) {
            int remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                numberOf1Bits++;
            }
            if (n == 0) {
                break;
            }
        }
        return numberOf1Bits;
    }
}
