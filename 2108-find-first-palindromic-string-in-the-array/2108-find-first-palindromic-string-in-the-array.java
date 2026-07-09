class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            boolean x = true;
            int a = 0;
            int b = words[i].length() - 1;
            while(a < b){
                if(words[i].charAt(a) != words[i].charAt(b)){
                    x = false;
                    break;
                }
                a++;
                b--;
            }
            if(x){
                return words[i];
            }
        }
        return "";
    }
}