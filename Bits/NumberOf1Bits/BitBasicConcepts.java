package Bits.NumberOf1Bits;

public class BitBasicConcepts {

    public static void main(String[] args) {

//        OR bitwise
        Integer a = 10;
        Integer b = 9;
        Integer c = a | b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" bitwise OR : " + c);
        System.out.println(Integer.toBinaryString(c));

//        AND bitwise
        a = 10;
        b = 9;
        c = a & b;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" bitwise AND : " + c);
        System.out.println(Integer.toBinaryString(c));

//        Bitwise complement
//        1s complemement - flip all the bits
//        2s complemt - flip all the bits + 1
//        '~' just means flip all bits (doesn't mean negative of a number)
//        whenever ther is 1 (negative number) to interpret it in decimal we have to to get 2s compleemnt of that number
        a = 10;
        b = 9;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" bitwise complement of : " + a + " is " + ~a);
        System.out.println(" bitwise complement of : " + b + " is " + ~b);
        System.out.println(" bitwise complement of double : " + b + " is " + b);

//       XOR bitwise
        a = 10;
        b = 9;
        c = a ^ b;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" bitwise XOR : " + c);
        System.out.println(Integer.toBinaryString(c));

//        left shift
        a = 10;
        b = 9;
        int shift = 1;
        c = a << shift;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" leftshift by " + shift + " is :" + c);
        System.out.println(Integer.toBinaryString(c));

        a = 10;
        b = 9;
        shift = 2;
        c = a << shift;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" leftshift by " + shift + " is :" + c);
        System.out.println(Integer.toBinaryString(c));

//        right shift
        a = 10;
        b = 9;
        shift = 1;
        c = a >> shift;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" rightshift by " + shift + " is :" + c);
        System.out.println(Integer.toBinaryString(c));

        a = 10;
        b = 9;
        shift = 2;
        c = a >> shift;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" rightshift by " + shift + " is :" + c);
        System.out.println(Integer.toBinaryString(c));
    }
}
