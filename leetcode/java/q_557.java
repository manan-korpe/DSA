//Time Complexity O(n) 
//space complexity O(n)

public class q_557 {
    // optimal solution but same time complexity
    class Solution1 {
        public static void wordSwap(char[] array, int i, int j) {

            while (i < j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        public String reverseWords(String s) {
            char[] wordArr = s.toCharArray();

            int i = 0;
            int j = 0;

            while (j < wordArr.length) {
                if (wordArr[j] == ' ') {
                    wordSwap(wordArr, i, j - 1);
                    j++;
                    i = j;
                }
                j++;
            }

            if (i < wordArr.length) {
                wordSwap(wordArr, i, wordArr.length - 1);
            }
            return new String(wordArr);
        }
    }
    //My Code
    class Solution2 {
        public String reverseWords(String s) {
            String[] sp = s.split(" ");

            for (int i = 0; i < sp.length; i++) {
                char[] c = sp[i].toCharArray();
                int x = 0, y = c.length - 1;

                while (x < y) {
                    char temp = c[x];
                    c[x++] = c[y];
                    c[y--] = temp;
                }

                sp[i] = new String(c);
            }
            return String.join(" ", sp);
        }
    }
}
