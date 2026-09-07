class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(temp.length-1);
        for(int i = temp.length - 2; i >= 0; i--){
            int j = temp[i];
            while(!stack.isEmpty()){
                if(j < temp[stack.peek()]){
                    ans[i] = stack.peek() - i;
                    break;
                } else{
                    stack.pop();
                }
            }
            stack.push(i);
        }
        return ans;
    }
}