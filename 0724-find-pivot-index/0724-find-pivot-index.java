class Solution {
    public int pivotIndex(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     int ls = 0;
        //     int rs = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(j > i){
        //             rs += nums[j];
        //         } else if(j < i){
        //             ls += nums[j];
        //         }
        //     }
        //     if(ls == rs){
        //         return i;
        //     }
        // }
        // return -1;
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        int ls = 0;
        int rs = totalSum - nums[0];
        for(int i = 0; i < nums.length; i++){
            if(ls == totalSum - nums[i] - ls){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}