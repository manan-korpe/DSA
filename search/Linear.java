package search;

public class Linear {
    static void search(int[] arr,int target){
        boolean isFound = false;
        int i = 0;
        while(i<arr.length){
            if(arr[i] == target){
                System.out.println("target "+target+" find at index of "+i);
                return;
            }

            i++;
        }
    
        if(!isFound){
            System.out.println("target "+target+" not found in array");
            return;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,10,40,50,70};
        search(arr,400);
    }
}
