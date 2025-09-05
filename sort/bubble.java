// Bubble Sort time complexity O(n*n)

public class bubble {
    public static void sort(int[] arr) {
        int temp;
        boolean isSorted;

        for(int i=0;i<arr.length-1;i++){
            isSorted = true;

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }

            if(isSorted){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 3, 50, 4, 5, 2, 60, 53 };
        sort(arr1);
    }
}