class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            if(map.containsKey(target -  nums[i])){
                return new int[] {i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        
    }


    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr = {1,2,3,4,5,6};
        int t = 4;
        obj.twoSum(arr,t);
    }

}














// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i = 0;i<nums.length;i++){
//             if(map.containsKey(target-nums[i])){
//                 return new int[]{i,map.get(target-nums[i])};
//             }
//             else{
//                 map.put(nums[i],i);
//             }
//         }

//         return new int[]{0,0};
        
//     }
// }