// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
//time: O(n log n) space: O(1)

// optimized Solution
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}


//time: O(n*m) space: O(1)

class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb =new StringBuffer("");
        int i = 0;

        while(i<strs[0].length()){
            char currentChar = strs[0].charAt(i);

            for(String s: strs){
                if(s.length()<=i || s.charAt(i) != currentChar){
                    return sb.toString();
                }
            }
            sb.append(currentChar);
            i++;
        }

        return sb.toString();
    }
}