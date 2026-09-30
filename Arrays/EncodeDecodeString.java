package Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {

    public static void main(String[] args) {
        String encodedString = encode(List.of("Hello", "World"));
        System.out.println("encode : " + encodedString);

        List<String> decodedString = decode(encodedString);
        System.out.println("decode : " + decodedString);
    }

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        if (strs != null && !strs.isEmpty()) {
            for (String str : strs) {
                int length = str.length();
//                encodedString = encodedString + length + "#" + str;
                encodedString.append(length).append("#").append(str);
            }
            return encodedString.toString();
        }
        return null;
    }

    //    5#juyhg
    //self resolution
    public static List<String> decode(String str) {
        List<String> stringList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            StringBuilder number = new StringBuilder();
            for (int i = 0; i < str.length(); /*i++*/) {
                char digit = str.charAt(i);
                if (digit != '#') {
                    number.append(digit);
                    i++;
                    continue;
                }
                System.out.println("number is : " + number);
                int intNumberValue = Integer.parseInt(number.toString());
                String decodedString = str.substring(i + 1, i + 1 + intNumberValue);
                i = i + 1 + decodedString.length();
                System.out.println("decoded String :" + decodedString);
                stringList.add(decodedString);
                number.setLength(0);
            }
        }
        return stringList;
    }

    //chatgpt decode logic
    public static List<String> decode1(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));

            String str = s.substring(j + 1, j + 1 + len);

            result.add(str);

            i = j + 1 + len;
        }

        return result;
    }

}
