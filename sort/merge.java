class Merge {
   
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] newArr = new int[high - low+1];

        int n1 = low;
        int n2 = mid + 1;
        int i = 0;

        while (n1<=mid && n2<=high) {
            if(arr[n1]<=arr[n2]){
                newArr[i++] = arr[n1++];
            }else{
                newArr[i++] = arr[n2++];
            }
        }

        while (n1<=mid) {
            newArr[i++] = arr[n1++];
        }
        while (n2<=high) {
            newArr[i++] = arr[n2++];
        }

        for(int x=low,y=0;y<newArr.length;y++,x++){
            arr[x] = newArr[y];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 9, 3, 6 };
        int size = arr.length - 1;
        mergeSort(arr, 0, size);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
