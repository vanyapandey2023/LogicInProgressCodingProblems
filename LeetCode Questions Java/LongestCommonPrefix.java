class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length == 1){
        return strs[0];
      } else if (strs[0].isEmpty() || strs[1].isEmpty() || strs[0].charAt(0) != strs[1].charAt(0)){
        return "";
      } else if(strs[0].charAt(0) != strs[1].charAt(0)){
        return "";
      } 
      int min = strs[0].length();
      for(int i = 0; i < strs.length; i++){
        min = Math.min(min, strs[i].length());
      }
      for(int i = 0; i < min; i++){
        char c = strs[0].charAt(i);
        for(int j = 1; j < strs.length; j++){
            if(c != strs[j].charAt(i)){
                return strs[0].substring(0, i);
            }
        }
      }
      return strs[0].substring(0, min);
    }
}
