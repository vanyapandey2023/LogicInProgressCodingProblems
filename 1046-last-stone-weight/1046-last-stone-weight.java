class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        } else if(stones.length == 1){
            return stones[0];
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < stones.length; i++){
            list.add(stones[i]);
        }
        while(list.size() > 1){
            int ix = -1;
            int iy = -1;
            for(int i = 0; i < list.size(); i++){
                int current = list.get(i);
                if(iy == -1 || current > list.get(iy)){
                    ix = iy;
                    iy = i;
                } else if(ix == -1 || current > list.get(ix)){
                    ix = i;
                }
            }
            int valX = list.get(ix);
            int valY = list.get(iy);
            list.remove(Math.max(ix, iy));
            list.remove(Math.min(ix, iy));
            if(valX != valY){
                list.add(valY - valX);
            }
        }
        if(list.size() == 0){
            return 0;
        } else{
            return list.get(0);
        }
    }
}