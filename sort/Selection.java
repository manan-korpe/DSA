//Time Complexity O(n*n)
//select a value and put it their currect index

public class Selection {

    public static void sort(int[] arr){
        int max,temp;

        for(int i=0;i<arr.length-1;i++){
            max = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[max]){
                    max = j; 
                }
            }
            temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,3,50,4,5,2,60,53};
        sort(arr1);
    }
}
