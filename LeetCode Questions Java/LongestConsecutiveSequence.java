import java.util.HashMap;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
       
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, false); 
        }

        int maxLength = 0;

       
        for (int num : hm.keySet()) {
        
            if (!hm.containsKey(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

              
                while (hm.containsKey(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}