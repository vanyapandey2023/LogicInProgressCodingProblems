class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int layer = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(layer != 0){
                    ans.append(s.charAt(i));
                }
                layer++;
            }
            if(s.charAt(i) == ')'){
                if(layer != 1){
                    ans.append(s.charAt(i));
                }
                layer--;
            }
        }
        return ans.toString();
    }
}