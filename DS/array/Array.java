public class Array{
    
    static void indexOf(int[] arr,int value){
        boolean isFind = false;
        for(int i=0; i<arr.length; i++){
            if(value == arr[i]){
                isFind = true;
                System.out.println(i);
            }
        }

        if(!isFind){
            System.out.println("value not found in array");
        }
    }   

    public static void main(String[] arg){
        int[] arr = {10,20,30,40,50};

        for(int val:arr){
            System.out.println(val);
        }

        indexOf(arr,20); //search index
    }
}