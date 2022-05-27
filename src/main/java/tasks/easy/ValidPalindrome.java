package tasks.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String justLetters = removeNonAlphanumeric(s);
        return justLetters.equalsIgnoreCase(reverseString(justLetters));
    }

    public static String removeNonAlphanumeric(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String reverseString(String str) {
        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return new String(result);
    }
}
