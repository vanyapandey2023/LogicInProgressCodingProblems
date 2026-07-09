import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
     if(s.length() == 1 || s.length() % 2 == 1){
        return false;
     }
     Stack<Character> stack = new Stack<>();
     for(int i = 0; i < s.length(); i++){
        char j = s.charAt(i);
        if(j == '{' || j == '[' || j == '('){
            stack.push(j);
        } else{
            if(j == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                } else{
                    stack.pop();
                }
            } else if(j == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    return false;
                } else{
                    stack.pop();
                }
            } else if(j == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                } else{
                    stack.pop();
                }
            }
        }

     }
     if(stack.isEmpty()){
        return true;
     } else{
        return false;
     }
    }
}