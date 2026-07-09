class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        
        
        for(int i = 0; i < nums.length; i++){ 
            int i1 = nums[i]; 
            if(hm.containsKey(i1)){ 
                hm.put(i1, hm.get(i1) + 1); 
            } else { 
                hm.put(i1, 1); 
            } 
        } 

        for(int key : hm.keySet()){ 
            boolean isNotPrime = false;
            int val = hm.get(key);

           
            if(val < 2){ 
                isNotPrime = true; 
            } else { 
          
                for(int i = 2; i * i <= val; i++){ 
                    if(val % i == 0){ 
                        isNotPrime = true; 
                        break; 
                    } 
                } 
            } 

          
            if(!isNotPrime){ 
                return true; 
            } 
        } 
        return false;
    }
}