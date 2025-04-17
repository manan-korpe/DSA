public class Duplicate {
    static int checkDuplicate(int[] nums){
        int k=0;

        for(int i=1;i<nums.length;i++){
            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];
            }
        }
        // System.out.println(k);
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int myK = checkDuplicate(nums);

        for(int i=0;i<myK+1;i++){
            System.out.println(nums[i]);
        }
    }
}
