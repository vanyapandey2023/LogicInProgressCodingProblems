class Solution {
    public int percentageLetter(String s, char letter) {
        if(s.length() == 1 && s.charAt(0) == letter){
            return 100;
        } else if(s.length() == 1 && s.charAt(0) != letter){
            return 0;
        }
        int times = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                times++;
            }
        }
        return (times*100)/s.length();
    }
}