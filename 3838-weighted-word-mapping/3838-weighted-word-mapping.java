class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       String ans = "";
       for(int i = 0; i < words.length; i++){
        int totalWeights = 0;
        String word = words[i];
        for(int j = 0; j < word.length(); j++){
            char ch = word.charAt(j);
            int index = (int)(ch - 'a');
            totalWeights += weights[index];
        }
        totalWeights = totalWeights % 26;
        char letter = (char)('z' - totalWeights);
        ans += letter;
       } 
       return ans;
    }
}