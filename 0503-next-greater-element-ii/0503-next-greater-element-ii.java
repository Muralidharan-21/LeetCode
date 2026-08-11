class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int res[] = new int[n];
        int k = 0;

        for(int i = 0 ; i<nums.length ;i++){
            int temp = -1;
            for(int j =1 ;j<n ; j++ ){
                int idx = (i+j)%n;

                if(nums[idx]>nums[i]){
                    temp = nums[idx];
                    break;
                }
            }
            res[k++] = temp;
        }
        return res;
        
    }
}





// class Solution {
//     public int[] nextGreaterElements(int[] nums) {

//         Stack<Integer> stack = new Stack<>();
//         int n = nums.length;
//         int[] res = new int[nums.length];

//         for(int i = 2*n-1 ;i>=0 ; i--) {
//             int idx = i % n;

//             while(!stack.isEmpty() && nums[idx]>= stack.peek()){
//                 stack.pop();
//             }
           
//             if(i<n){
//                 res[i] = stack.isEmpty() ? -1 : stack.peek();
//             }

//              stack.push(nums[idx]);


//         }
//         return res;
        
//     }
// }
