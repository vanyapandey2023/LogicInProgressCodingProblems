class Solution {
    public int firstUniqChar(String s) {
        int[] f = new int[26];
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            int b = a - 'a';
            f[b]++;
        }
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            int b = a - 'a';
            if(f[b] == 1){
                return i;
            }
        }
        return -1;
        
    }
}