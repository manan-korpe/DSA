public class Binary {
    static void search(int[] arr,int start,int end,int target){
        int mid;
        boolean isFound = false;
        while (start <= end) {
            mid = start + (end-start)/2;

            if(target == arr[mid]){
                System.out.println("target "+target+" find at index of "+mid);
                isFound =true;
                return;
            }

            if (target<arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

       if(!isFound){
        System.out.println("target "+target+" not found in array");
        return;
       }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,10,40,50,70};
        search(arr, 1, arr.length-1, 40);
    }
}
