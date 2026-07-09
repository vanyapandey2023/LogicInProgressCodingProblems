class Solution {
    public boolean equalFrequency(String s) {
      HashMap<Character, Integer> hm = new HashMap<>();  
      int min = 101;
      int max = 0;
      int minCount = 0;
      int maxCount = 0;
      int otherCount = 0;
      for(int i = 0; i < s.length(); i++){
        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
      }
      for(int i : hm.values()){
        if(i < min){
            min = i;
        }
        if(i > max){
            max = i;
        }
      }
      for(int i : hm.values()){
        if(i == min){
           minCount++; 
        } 
        if(i == max){
            maxCount++;
        } 
        if(i != max && i != min){
            return false;
        }
      }
     if (hm.size() == 1 || max == 1) return true;
    if (maxCount == 1 && max - min == 1 && otherCount == 0) return true;
    if (minCount == 1 && min == 1 && otherCount == 0 && maxCount == hm.size() - 1) return true;

    return false;

    }
}