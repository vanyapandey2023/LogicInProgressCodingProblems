class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer, Integer> hm = new HashMap<>();
       int maxLuckyInt = -1;
       for(int i = 0; i < arr.length; i++){
        int i1 = arr[i];
        if(hm.containsKey(i1)){
            hm.put(i1, hm.get(i1) + 1);
        } else{
            hm.put(i1, 1);
        }
       }
       for(int key : hm.keySet()){
        if(hm.get(key) == key){
            maxLuckyInt = Math.max(maxLuckyInt, key);
        }
       }
       return maxLuckyInt;
    }
}