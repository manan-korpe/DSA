import java.util.Arrays;

public class Quick {

    public static int partition(int[] arr, int low,int high) {
        int pivot_point = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<=pivot_point){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void QuickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot_index = partition(arr, low,high);
            QuickSort(arr, pivot_index+1, high);
            QuickSort(arr, low,pivot_index-1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {10,12,8,2,13,5};
        QuickSort(arr1,0,arr1.length-1);

        
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(arr1));
    }
}
