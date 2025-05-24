class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a); //to make it a max-heap using custom comparator:
        for(int c : stones){
            pq.add(c); //Add all stones into max-heap
        }
        while(pq.size()>1){
            int top1 = pq.poll(); //heaviest stone
            int top2 = pq.poll(); //2nd heaviest stone
            int diff = Math.abs(top1-top2);

            if(diff != 0){ 
                pq.add(diff); //x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x(diff)
            }
        }
        return pq.size() != 0 ? pq.poll() : 0;
    }
}