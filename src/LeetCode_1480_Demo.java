import java.util.Arrays;

public class LeetCode_1480_Demo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] nums = new int[]{1,2,3,4};
            System.out.println(Arrays.toString(sol.runningSum(nums)));

    }

    //solution for 1480 Running Sum of 1d Array
   static class Solution{
        public int[] runningSum(int[] nums) {
                for(int i=1;i<nums.length;i++){
                    nums[i] += nums[i-1];
                }
                return nums;
        }
    }
}


