class Solution {
    public int mySqrt(int x) {
      int start = 0;
      int end = x;
      while(start <= end){
        int mid = (end+start)/2;
        long reg = (long) mid * mid;
        if(reg < x){
            start = mid + 1;
        } else if(reg > x){
            end = mid - 1;
        } else{
            return mid;
        }
      } 
      return end; 
    }
}