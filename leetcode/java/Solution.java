// https://leetcode.com/problems/reverse-vowels-of-a-string/description/
// Time Complexity: O(n)
// Space Complexity: O(n)

public class Solution {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        StringBuffer sb = new StringBuffer(s);

        while (i < j) {
            if (!isVowel(s.charAt(i))) {
                i++;
            } else if (!isVowel(s.charAt(j))) {
                j--;
            } else {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
} 


import java.util.HashSet;
import java.util.Set;
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution2 {
    public static Set<Character> vowel = new HashSet();
   
    static {
        vowel.add('a'); vowel.add('e'); vowel.add('i'); vowel.add('o'); vowel.add('u'); vowel.add('A'); vowel.add('E'); vowel.add('I'); vowel.add('O'); vowel.add('U');
    }
    
    public static String reverseVowels(String s){
        char[] cs = s.toCharArray();
        int i=0, j =s.length() -1;
        
        while(i<j){
            if(i<j && !vowel.contains(cs[i])){
                i++;
            }
            
            if(i<j && !vowel.contains(cs[j])){
                j--;
            }
            
            if(i<j){
                char temp = cs[i];
                cs[i] = cs[j];
                cs[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(cs);
    }
    
    public static void main(String[] args) {
        String ans = reverseVowels("IceCreAm");
        System.out.println(ans);
    }
}
