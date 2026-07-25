class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
      if(tickets.length == 1){
        return tickets[0];
      }
      int ans = 0;
      for(int i = 0; i < tickets.length; i++){
        if(i == k){
            ans += tickets[i];
        } else if(i < k){
            ans += Math.min(tickets[i], tickets[k]);
        } else if(i > k){
            ans += Math.min(tickets[i], tickets[k] - 1);
        }
      }
      return ans;
    }
}