import java.util.HashMap;
class Solution {
    public int findDuplicate(int[] nums) {
        int duplicateNum = -1;
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int i1 = nums[i];
            if(hm.containsKey(i1)){
                hm.put(i1, hm.get(i1) + 1);
            } else{
                hm.put(i1, 1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key) >= 2){
                duplicateNum = key;
                break;
            }
        }
        return duplicateNum;
    }
}