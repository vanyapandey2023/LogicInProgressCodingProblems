class Solution {
    public boolean checkOnesSegment(String s) {
        int v = 0;
        boolean t = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                t = false;
            }
            if(s.charAt(i) == '1' && t == false){
                v++;
            }
        }
        if(t == false && v > 0){
            return false;
        } else{
            return true;
        }
    }
}
