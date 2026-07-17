class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);

        Stack<Integer> stack = new Stack<>();

        for(int i = n * 2 -1;i>=0;i--){
            int idx = i%n;

            while(!stack.isEmpty() && nums[idx]>=stack.peek()){
                stack.pop();
            }
            if(i<n){
                res[i] = stack.isEmpty() ? -1 : stack.peek();  
            }
            stack.push(nums[idx]);
        }
        return res;
        
    }
}







// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
        
//         Stack<Integer> stack = new Stack<>();
//         int n = nums.length;
//         int res[] = new int[n];
//         Arrays.fill(res,-1);

//         for(int i = 2*n -1 ; i>=0 ; i--){

//             int idx = i%n;

//             while(!stack.isEmpty() && nums[idx]>= stack.peek()){
//                 stack.pop();
//             }

//             if(i<n){
//                 res[i] =   stack.isEmpty() ? -1 : stack.peek();
//             }

//             stack.push(nums[idx]);
//         }

//         return res;

//     }
// }