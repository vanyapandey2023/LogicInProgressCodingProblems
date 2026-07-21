class Solution {
    public String reversePrefix(String word, char ch) {
        if(ch == word.charAt(0) || word.length() == 1){
            return word;
        }
        Stack<Character> stack = new Stack<>();
        boolean check = true;
        int j = 0;
        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
            if(word.charAt(i) == ch){
                check = false;
                j = i + 1;
                break;
            }
        }
        if(check){
            return word;
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans += String.valueOf(stack.pop());
        }
        for(int i = j; i < word.length(); i++){
            ans += String.valueOf(word.charAt(i));
        }
        return ans;

    }
}