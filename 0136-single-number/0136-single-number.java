class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int tracker = 0;
        for(int n : nums){
            tracker ^= n;
        }
        return tracker;
    }

}