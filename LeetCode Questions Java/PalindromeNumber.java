class Solution {
    public boolean isPalindrome(int x) {
     if(x < 0){
        return false;
     } 
     int num = x;
     int Rnum = 0;
     while(num!=0){
        Rnum = Rnum*10 + num%10;
        num = num/10;
     }
     if(x == Rnum){
        return true;
     } else{
        return false;
     }
        

    }
}