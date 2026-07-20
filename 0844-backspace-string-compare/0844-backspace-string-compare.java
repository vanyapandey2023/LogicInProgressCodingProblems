class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ans = "";
        String ans1 = "";
        int delete = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '#'){
                delete++;
            } else if(delete != 0){
                delete--;
            } else{
                ans += String.valueOf(s.charAt(i));
            }
        }
        delete = 0;
        for(int i = t.length() - 1; i >= 0; i--){
            if(t.charAt(i) == '#'){
                delete++;
            } else if(t.charAt(i) != '#' && delete != 0){
                delete--;
            } else if(t.charAt(i) != '#' && delete == 0){
                ans1 += String.valueOf(t.charAt(i));
            }
        }
        return ans.equals(ans1);
    }
}