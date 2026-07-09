class Solution {
    public int numberOfChild(int n, int k) {
        int direction = 1;
        int i = 0;
       for(int j = 0; j < k; j++){
         if(i == 0){
            direction = 1;
        } else if(i == n - 1){
            direction = -1;
        }
        i += direction;
       } 
       return i;
    }
}