// https://leetcode.com/problems/valid-palindrome

class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isPalindrome1(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // Skip non-alphanumeric characters
            while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;

            // Compare after converting to lowercase
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isPalindrome2(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        ;
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
