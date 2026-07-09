class Solution {
    public int maxArea(int[] height) {
        int end = height.length-1;
        int start = 0;
        int max_area = 0;
        while(start < end){
            int length = Math.min(height[start], height[end]);
            int width = end - start;
            int current_area = length * width;
            max_area = Math.max(current_area, max_area);
            if(height[start] < height[end]){
                start++;
            } else{
                end--;
            }
        }
        return max_area;
    }
}
