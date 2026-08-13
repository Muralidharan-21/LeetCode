class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1]-b[1]);

        for(int key : map.keySet()){

            int freq = map.get(key);
            pq.add(new int[] {key,freq});

            if(pq.size()>k){
                pq.poll();
            }

        }

        int[] res = new int[k];
        for(int i = 0 ; i<k ;i++){
            res[i] = pq.poll()[0];
        }

        return res;
        
    }
}












// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int n : nums){
//             map.put(n,map.getOrDefault(n,0)+1);
//         }

//         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->a[1] - b[1]);

//         for(int key : map.keySet()){
//             int freq  = map.get(key);
//             pq.add(new int[]{key,freq});

//             if(pq.size()>k){

//                 pq.poll();
//             }
//         }
//         int res[] = new int[k];
        

//         for(int i = 0; i<k ; i++){
//             res[i] = pq.poll()[0];
//         }
//         return res;
       
        
//     }
// }