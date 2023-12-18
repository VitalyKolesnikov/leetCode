package tasks.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int i = 1;

        while (i <= strs[0].length()) {
            String prefix = strs[0].substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    return result;
                }

            }
            result = prefix;
            i++;
        }

        return result;
    }

}
