class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res = (i+1) * (27-(s.charAt(i) - 96));
            ans += res;
        }
        return ans;
    }
}