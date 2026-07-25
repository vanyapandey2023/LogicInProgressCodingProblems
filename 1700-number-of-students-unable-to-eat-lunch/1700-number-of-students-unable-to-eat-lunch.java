class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int one = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] == 1){
                one++;
            } else{
                zero++;
            }
        }
        for(int i = 0; i < sandwiches.length; i++){
            if(sandwiches[i] == 1){
                if(one == 0){
                    int ans = sandwiches.length - i;
                    return ans;
                }
                one--;
            } else{
                if(zero == 0){
                    int ans = sandwiches.length - i;
                    return ans;
                }
                zero--;
            }
        }
        return 0;
    }
}