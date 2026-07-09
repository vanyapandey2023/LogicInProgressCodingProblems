class Solution {
    public double myPow(double x, int N) {
        if(x == 1 || N == 0){
            return 1;
        } else if(N == 1){
            return x;
        }
        long n = N;
        double runningTotal = 1;
        if(n < 0){
            x = 1/x;
            n = n * -1;
        }
        while(n > 0){
            if(n % 2 == 0){
                x = x*x;
                n = n/2;
            } else{
                runningTotal = runningTotal * x;
                n--;
                x = x*x;
                n = n/2;
            }
        }
        return runningTotal;
    }
}