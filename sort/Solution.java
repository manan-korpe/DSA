
public class Solution {
     public static int triangularSum(int[] nums) {
        if(nums.length ==1 ){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                nums[j] = nums[j] + nums[j+1];
            }
            
        }

        return nums[0];
    }
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
       
       int ans = triangularSum(nums);
        System.out.println(ans);
    }
}
