class Solution {
    public int lastStoneWeight(int[] stones) {

        // if(stones.length==1){
        //     return stones[0];
        // }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            pq.add(x);
        }

        while(pq.size()>1){

            int x = pq.poll();
            int y = pq.poll();

            if(x>y){
                pq.add(x-y);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
        
    }
}





























// class Solution {
//     public int lastStoneWeight(int[] stones) {

//         if(stones.length==1){
//             return stones[0];
//         }
        
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//         for(int x : stones){
//             pq.add(x);
//         }

//         while(pq.size()>1){

//         int x = pq.poll();
//         int y = pq.poll();

//         if(x > y){
//             pq.add(x-y);
//         }
//         }

//         return pq.isEmpty() ? 0 : pq.peek();

//     }
// }