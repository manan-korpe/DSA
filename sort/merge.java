class Merge {
    public static void conc(int[] arr,int si,int mid,int ei){
        int[] mergeArr = new int[ei - si + 1];
        
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;

        while (idx1 <=mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergeArr[x++] = arr[idx1++];
            }else{
                mergeArr[x++] = arr[idx2++];
            }
            
        }

        while (idx1 <= mid) {
            mergeArr[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            mergeArr[x++] = arr[idx2++];
        }

        for(int i=0,j=si; i<mergeArr.length ; i++,j++){
            arr[j] = mergeArr[i];
        }
    }

    public static void sort(int[] arr,int min,int max){
        if(min>=max){
            return;
        }
            int mid =min +(max-min)/2;
            // System.out.println(mid);
            sort(arr,min,mid);
            sort(arr,mid+1,max);
            conc(arr,min,mid,max);
    }

    public static void main(String[] args) {
        int[] arr = {5,8,7,9,3,6};
        int size = arr.length -1;
        sort(arr,0, size);
        

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }   
}
