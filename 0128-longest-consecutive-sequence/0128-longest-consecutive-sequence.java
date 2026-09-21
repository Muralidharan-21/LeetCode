class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int max = 0;
        for(int x: set){
            if(!set.contains(x-1)){
                int curr = x;
                int len = 1;

                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }

                max = Math.max(max,len);

            }
        }

        return max;
        
    }
}
















// class Solution {
//     public int longestConsecutive(int[] nums) {
        
//         HashSet<Integer> set = new HashSet<>();

//         for(int num : nums){
//             set.add(num);
//         }

//         int max = 0;
//         for(int num : set){

//             if(!set.contains(num-1)){
//                 int cur = num;
//                 int len = 1;

//                 while(set.contains(cur+1)){
//                     cur++;
//                     len++;
//                 }
//                 max = Math.max(max,len);
//             }
//         }

//         return max;

//     }
// }