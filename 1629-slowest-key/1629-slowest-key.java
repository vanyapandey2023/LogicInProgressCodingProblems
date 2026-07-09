class Solution {
    public char slowestKey(int[] rT, String kP) {
        int currTime = rT[0];
        int maxTime = rT[0];
        char ans = kP.charAt(0);
        for(int i = 1; i < rT.length; i++){
            currTime = rT[i] - rT[i - 1];
            if(currTime > maxTime){
                maxTime = currTime;
                ans = kP.charAt(i);
            } else if(currTime == maxTime){
                if(kP.charAt(i) > ans){
                    ans = kP.charAt(i);
                }
            }
        }
        return ans;
    }
}