// Bubble Sort time complexity O(n*n)

public class bubble{
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args){
        int[] arr1 = {10,3,50,4,5,2,60,53};
        sort(arr1);
    }
}