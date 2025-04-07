//Time Complexity O(n*n)

public class Selection {
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
                if(i != min){
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }

        //showing sorted array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,3,50,4,5,2,60,53};
        sort(arr1);
    }
}
