class Solution {
    public boolean isPalindrome(String s1) {
        String s = "";
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z'){
                s += String.valueOf(s1.charAt(i));
            } else if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
                s += Character.toLowerCase(s1.charAt(i));
            } else if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9'){
                 s += String.valueOf(s1.charAt(i));
            }
        }
        if(s.isEmpty() || s.length() == 1){
            return true;
        }
        int x = 0;
        int y = s.length() - 1;
        while(x < y){
            if(s.charAt(x) != s.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}