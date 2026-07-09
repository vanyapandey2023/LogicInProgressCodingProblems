class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = -1;
        int max_index = 0;
        int times = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                max_index = i;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == max){
                continue;
            }else if((nums[j]*2) <= max){
                times++;
            }
        }
        if(times == nums.length - 1){
            return max_index;
        } else{
            return -1;
        }
    }
}