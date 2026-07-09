class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] < 10){
            digits[0]++;
        }
        for(int i= digits.length-1; i > 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                break;
            } else{
                digits[i-1]++;
                digits[i] = 0;
                if(digits[i-1] < 10){
                    break;
                }
            }
        }
        if(digits[0] >= 10){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        } else{
            return digits;
        }
    }
}