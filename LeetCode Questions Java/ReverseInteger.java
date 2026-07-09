class Solution {
    public int reverse(int x) {
        int y = x;
        long n = 0;
        while(y != 0){
            n = n * 10;
            n += (y%10);
            y -= (y%10);
            y = y/10;
        }
        if(n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){
            return 0;
        }
        return (int) n;
    }
}