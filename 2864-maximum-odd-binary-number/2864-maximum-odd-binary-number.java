class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[] nums = new int[2];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                nums[0]++;
            } else{
                nums[1]++;
            }
        }
       StringBuilder ans = new StringBuilder();
        for(int i = 0; i < nums[1] - 1; i++){
           ans.append('1');
        }
        for(int i = 0; i < nums[0]; i++){
            ans.append('0');
        }
        ans.append('1');
        return ans.toString();
    }
}