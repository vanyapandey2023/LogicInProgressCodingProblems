class Solution {
    public int maxProduct(int[] nums) {
       int ans = 0;
       for(int i=0;i<nums.length; i++){
        int num = nums[i];
        for(int j=i+1;j<nums.length; j++){
            int num2 = nums[j];
            if(((num-1)*(num2-1)) > ans){
                int eger = (num-1)*(num2-1);
                ans = eger;
            }
        }
       }
       return ans;
    }
}