class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       long sum = 0;
       int max = 0;
       for(int i = 0; i < piles.length; i++){
        sum += (long)piles[i];
        max = Math.max(max, piles[i]);
       }
       int min = (int)((sum+h-1)/h);
       while(min <= max){
        int mid = (max+min)/2;
        int t = 0;
        for(int i = 0; i < piles.length; i++){
            t += (piles[i] + mid - 1) / mid;
        }
        if(t <= h){
           max = mid - 1; 
        } else{
            min = mid + 1;
        }
       }
        return min;
    }
}