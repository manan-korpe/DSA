
public class Counting {
    public static void sort(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int[] frequency = new int[max+1];
        int[] result = new int[arr.length];

        
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]] = frequency[arr[i]]+1;
        }

        int j=-1;
        for(int i=0;i<frequency.length;i++){
                while (frequency[i]>0) {
                    result[++j] = i;
                    frequency[i] = frequency[i]-1;
                }
        }
        
        for(int i=0;i<result.length;i++){
            System.out.println(i+" : "+result[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 14, 2, 3, 2,10};
        sort(arr);
    }
}
