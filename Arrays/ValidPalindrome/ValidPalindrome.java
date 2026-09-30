package Arrays.ValidPalindrome;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println("isPalindrome : "+ isPalindrome(s));
        //        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

        s = "race a car";
        System.out.println("isPalindrome : "+ isPalindrome(s));

        s = " ";
        System.out.println("isPalindrome : "+ isPalindrome(s));

        s = "0P";
        System.out.println("isPalindrome : "+ isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        s= s.replaceAll("([^A-Za-z0-9])", "").toLowerCase();
        if(s.isBlank()){
            return true;
        }
        for(int i =0; i<= s.length()/2 - 1; i++){
            if(!((s.charAt(i) == s.charAt(s.length() - i -1)))){
                return false;
            }
        }
        return true;
    }
}
