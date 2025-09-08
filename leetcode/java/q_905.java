// Time Complexity: O(n)
// Space Complexity: O(1)
public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i != j) {
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                }
                j++;
            }

        }

        return nums;
    }
}

// optimal solution
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution2 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            while (left < right && nums[left] % 2 == 0)
                left++;
            while (left < right && nums[right] % 2 == 1)
                right--;

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}
