class Solution {
    public double average(int[] salary) {
        double average = 0;
        double sum = 0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
            if(salary[i] > max){
                max = salary[i];
            } 
            if(salary[i] < min){
                min = salary[i];
            }
        }
        sum = sum - (min + max);
        average = sum/(salary.length-2);
        return average;
    }
}