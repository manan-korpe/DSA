public class Radix {

    // Function to get the maximum number
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Counting sort used for each digit place
    public static void countingSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 0 to 9 digits

        // Count occurrences based on digit at 'place'
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[--count[digit]] = arr[i];
        }

        // Copy output to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Main radix sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Apply counting sort for each digit place (1s, 10s, 100s...)
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
