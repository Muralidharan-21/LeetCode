class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n-1;

        int max = 0;

        while(left<right){

            int cur_sum = (right-left) * Math.min(height[left],height[right]);
            max = Math.max(cur_sum,max);

            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }

        }

        return max;
        
    }
}













// class Solution {
//     public int maxArea(int[] height) {

//         int n = height.length;
//         int left = 0;
//         int right = n - 1;

//         int max = Integer.MIN_VALUE;

//         while(left < right){

//             if(height[left]<height[right]){
//                 max =  Math.max(max,height[left]*(right-left));
//                 left++;
//             }
//             else{
//                 max = Math.max(max,height[right]*(right-left));
//                 right--;
//             }

//         }
//         return max;

        
//     }
// }

