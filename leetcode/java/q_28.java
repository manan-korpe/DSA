public class q_28 {
    
}

// time: O(n*m) space: O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int needleLen = needle.length();

        while (i <= haystack.length() - needleLen) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
            i++;
        }

        return -1;
    }
}

// optimized KMP algorithm
// time: O(n + m) space: O(m)

class Solution2 {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int[] lps = computeLPSArray(needle);
        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
                if (j == needle.length()) return i - j;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    private static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

}