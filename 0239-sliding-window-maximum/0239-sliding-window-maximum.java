class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int left = 0;
        int n = nums.length;
        int[] res = new int[n-k+1];
        int p = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int right = 0 ; right<n ; right++){
            
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(right-left+1>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(right-left+1==k){
                res[p++] = map.lastKey();
            }

        }
        return res;

    }
}



// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {

//         int n = nums.length;
//         int left = 0;
//         int[] res = new int[n-k+1];
//         int p =0;
//         TreeMap<Integer,Integer> map =new TreeMap<>();

//         for(int right =0 ;right<nums.length;right++){
//             map.put(nums[right],map.getOrDefault(nums[right],0)+1);


//             while(right-left+1>k){
//                 map.put(nums[left],map.get(nums[left])-1);
//                 if(map.get(nums[left])==0){
//                     map.remove(nums[left]);
//                 }
//                 left++;
//             }
//             if(right -left +1 ==k){
//             res[p++] = map.lastKey();
//             }
//         }
        

//         return res;
//     }
// }