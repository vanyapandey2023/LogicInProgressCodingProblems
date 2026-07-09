class Solution {
    public boolean areOccurrencesEqual(String s) {
       int [] f = new int[26];
       int firstNum = 0;
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        int index = (int)(ch - 'a');
        f[index]++;
       } 
       for(int i = 0; i < f.length; i++){
        if(f[i] != 0){
            if(firstNum == 0){
                firstNum = f[i];
            } else if(f[i] != firstNum){
                return false;
            }
        }
       }
       return true;
    }
}