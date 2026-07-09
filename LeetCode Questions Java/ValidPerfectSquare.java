class Solution {
    public boolean isPerfectSquare(int num) {
      if(num == 1){
        return true;
      } else if(num == Integer.MAX_VALUE){
        return false;
      }
      long start = 0;
      long end = num/2;
      while(start <= end){
        long mid = (start + end)/2;
        long m = mid * mid;
        if(m == num){
            return true;
        } else if(m < num){
            start = mid + 1;
        } else if(m > num){
            end = mid - 1;
        }
      }
      return false;
    }
}