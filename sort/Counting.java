package sort;

public class Counting {
    public static void sort(int[] arr){
        
        int[] countArr = {0,0,0,0,0};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            countArr[arr[i]] = countArr[arr[i]]+1;
        }

        for(int i=0;i<countArr.length;i++){
            for(int j=0;j<countArr[i];j++){
                arr[count] = i;
                count++;
            }
        }   
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 3, 2,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
