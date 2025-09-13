// Time Complexity: O(n)
// Space Complexity: O(n)
class q_541c {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int i = 0;

        while (i < c.length) {
            int x = i, y = i + k-1;

            if (y >= c.length) {
                y = c.length - 1;
            }

            while (x < y) {
                char temp = c[x];
                c[x++] = c[y];
                c[y--] = temp;
            }
            i += 2 * k;
        }

        return new String(c);
    }
}