package LeetCode;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        //Kadanes algorithm
        int currSum = 0;
        int count = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(currSum < 0){
                currSum = 0;
                count++;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        if(count == nums[nums.length]){
            maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++){
                maxSum = Math.max(maxSum, nums[i]);
            }
        }
        return maxSum;
    }
}
