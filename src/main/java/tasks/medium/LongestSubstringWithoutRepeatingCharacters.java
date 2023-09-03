package tasks.medium;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int maxLength = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            left = Math.max(arr[s.charAt(right)], left);
            maxLength = Math.max(maxLength, right - left + 1);
            arr[s.charAt(right)] = right + 1;
        }

        return maxLength;
    }

}
