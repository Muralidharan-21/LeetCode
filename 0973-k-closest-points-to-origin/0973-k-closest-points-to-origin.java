class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
            int d1 = a[0] * a[0] + a[1] * a[1];
            int d2 = b[0] * b[0] + b[1] * b[1];

            return d1 - d2;
            }
        );

        for(int[] x : points ){
            pq.add(x);
        }

        int[][] res = new int[k][2];

        for(int i = 0 ; i < k ; i++){
            res[i] = pq.poll();
        }

        return res;


    }
}


































// class Solution {
//     public int[][] kClosest(int[][] points, int k) {

//         PriorityQueue<int[]> pq = new PriorityQueue<>(
//             (a,b) ->{ int d1 = a[0] * a[0] + a[1] * a[1];
//             int d2 = b[0] * b[0] + b[1] * b[1];
//             return d2-d1; }
//         );

//         for(int[] x : points){
//             pq.add(x);
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         }

//         int[][] res = new int[k][2];

//         for(int i = 0 ; i<k ;i++){
//             res[i] = pq.poll();
//         }
//         return res;


        
//     }
// }