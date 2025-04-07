// Bubble Sort time complexity O(n*n)
//step 1 - take 1st element as sorted array 
//step 2 - compare current value with right array's each element and put it in right place in right array

public class Insertion {
    public static void sort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int t=0;t<=i;t++){
                System.out.print(arr[t]+",");
            }
            System.out.println();
           int min =i;
            for(int j=i-1;j>=0;j--){
               if(arr[min]<arr[j]){
                int temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;
                min=j;
               }
            }
        }

        //showing sorted array
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,3,50,4,5,2,60,53};
        sort(arr1);
    }
}
