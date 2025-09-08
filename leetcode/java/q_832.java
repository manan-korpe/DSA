// Time Complexity: O(n*m)
// Space Complexity: O(n)
public class Solution {
    static public void swap(int[][] image, int n, int x, int y) {
        while (x <= y) {
            if (x == y) {
                image[n][x] = image[n][x] ^ 1;
            } else {
                int temp = image[n][x] ^ 1;
                image[n][x] = image[n][y] ^ 1;
                image[n][y] = temp;
            }
            x++;
            y--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int j = image.length - 1;
        int i = 0;
        int y = j;

        while (i <= j) {
            if (i == j) {
                swap(image, i, 0, y);
            } else {
                swap(image, i, 0, y);
                swap(image, j, 0, y);
            }
            i++;
            j--;
        }

        return image;
    }
} {
    
}
