class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sum = Math.max(sum, nums[i]);
            max = Math.max(max, sum);
        }
        
        return max;
        
    }
}
