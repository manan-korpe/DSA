public class Find {

    static int FindVal(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end + 1;
    }

    static int[] carrArr(int[] digits) {
        int[] newArr = new int[digits.length + 1];
        newArr[newArr.length - 1] = 1;
        int i = digits.length - 1;

        do {
            newArr[i] = (digits[i] + newArr[i + 1]) / 10;
            newArr[i + 1] = (digits[i] + newArr[i + 1]) % 10;
            i--;
        } while (i >= 0);

        if(newArr[0] == 0){
            for(int j=0;j<digits.length ;j++){
                digits[j] = newArr[j+1];
            }
            return digits;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 9 };

        // int ans = FindVal(arr, 4);
        // System.out.println(ans);
        int[] ans = carrArr(arr);

        for (int i : ans) {
        System.out.println(i);
        }
    }
}
