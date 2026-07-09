class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<1){
        return false;
       } 
       int num = n;
       while(num!=1){
        if(num%2==1){
            return false;
        }
        if(num/2==1){
            return true;
        }
         num=num/2;
       }
       return true;
    }
}