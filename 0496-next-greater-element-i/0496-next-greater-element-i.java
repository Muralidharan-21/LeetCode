class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length-1 ; i>=0 ; i--){
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }
            int x = stack.isEmpty() ? -1 : stack.peek();
            map.put(nums2[i],x);
            stack.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        int k = 0; 
        for(int x : nums1){
            res[k++] = map.get(x);
        }

        return res;
       


        
    }
}





























// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//         HashMap<Integer,Integer> map = new HashMap<>();
//         Stack<Integer> stack = new Stack<>();

//         for(int i = nums2.length-1 ; i>=0;i--){

//             while(!stack.isEmpty() && nums2[i]>=stack.peek()){
//                 stack.pop();
//             }
//             map.put(nums2[i],stack.isEmpty()?-1 : stack.peek());
//             stack.push(nums2[i]);
//         }

//         int[] res = new int[nums1.length];
//         int p = 0;
        
//         for(int x : nums1){
//             res[p++] = map.get(x);
//         }
//         return res;
        
//     }
// }