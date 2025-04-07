import java.util.Arrays;

public class Quick {

    public static int partition(int[] arr,int low,int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        for(int x=low;x<=high;x++){
            System.out.print(arr[x]+",");
        }
        System.out.println(" ");
        return (i+1);
    }

    public static void sort(int[] arr,int low, int high) {
       if(low < high){
        int partPv = partition(arr, low, high);

        sort(arr,low,partPv -1);
        sort(arr,partPv +1,high);
       }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,12,8,2,13,5};
        sort(arr1,0,arr1.length-1);

        
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(arr1));

    }
}
