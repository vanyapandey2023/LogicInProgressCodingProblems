class Solution {
    public String removeDuplicates(String s) {
      if(s.length() == 1){
        return s;
      }
      Stack<Character> stack = new Stack<>();
      stack.push(s.charAt(s.length()-1));
      for(int i = s.length() - 2; i >= 0; i--){
        if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
            stack.pop();
        } else{
            stack.push(s.charAt(i));
        }
      }
      String ans = "";
      while(!stack.isEmpty()){
        ans += Character.toString(stack.pop());
      }
      return ans;
    }
}