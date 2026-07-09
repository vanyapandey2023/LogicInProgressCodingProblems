class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
        return false;
       } 
       int [] f = new int[26];
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        int index = (int)(ch - 'a');
        f[index]++;
        char ch2 = t.charAt(i);
        int index2 = (int)(ch2 - 'a');
        f[index2]--;
       }
       for(int i = 0; i < f.length; i++){
        if(f[i] != 0){
            return false;
        }
       }
       return true;
    }
}