class Solution {
    public int[] asteroidCollision(int[] ast) {
        if(ast.length == 1){
            return ast;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i : ast){
            boolean k = false;
           while(!stack.isEmpty() && stack.peek() > 0 && i < 0){
            int j = stack.peek();
            if(j < 0){
                k = true;
                break;
            }
            if(j < -i){
                stack.pop();
            } else if(j == -i){
                stack.pop();
                k = true;
                break;
            } else{
                k = true;
                break;
            }
           } 
            if(!k){
                stack.push(i);
            }
        }
        
        int[] ans1 = new int[stack.size()];
        for(int i = ans1.length-1; i >=0; i--){
            ans1[i] = stack.pop();
        }
        return ans1;
    }
}