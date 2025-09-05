// Insertion Sort time complexity: O(n*n)
// Step 1 - Start from the second element (index 1), assume first part is sorted
// Step 2 - Compare current element with sorted part and insert it into correct position

public class Insertion {
    public static void sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 3, 50, 4, 5, 2, 60, 53 };
        sort(arr1);
    }
}
