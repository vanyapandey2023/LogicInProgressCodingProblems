class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxValue = 0;
        int currentValue = 0;
        for(int i = 0; i < nums.length; i++){
            currentValue += nums[i];
            if(currentValue > maxValue){
                maxValue = currentValue;
            } 
            if(i == nums.length - 1){
                continue;
            }
            if(nums[i+1] < nums[i] || nums[i+1] == nums[i]){
                currentValue = 0;
            }
        }
        return maxValue;
    }
}