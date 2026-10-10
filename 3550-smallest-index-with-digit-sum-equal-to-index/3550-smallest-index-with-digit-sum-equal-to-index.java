class Solution {
    public int smallestIndex(int[] nums) {
      for(int i = 0; i < nums.length; i++){
        if(nums[i] == i && nums[i] - 10 < 0){
            return i;
        } else if(nums[i] - 10 >= 0){
            int num1 = 0;
            int num = nums[i];
            while(num != 0){
                num1 += num%10;
                num = num/10;   
            }
            if(num1 == i){
                return i;
            }
        }
      }
      return -1;
    }
}