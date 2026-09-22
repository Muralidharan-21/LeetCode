class Solution {
    public void sortColors(int[] nums) {

        int mid = 0 ;
        int low = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }

            else{
                mid++;
            }
        }
        
    }
}












// class Solution {
//     public void sortColors(int[] nums) {

//         int m = 0;
//         int l = 0;
//         int h = nums.length-1;

//         while(m<=h){

//             if(nums[m]==2){
//                 int temp = nums[m];
//                 nums[m] = nums[h];
//                 nums[h] = temp;
//                 h--;

//             }
//             else if(nums[m] == 0){
//                 int temp = nums[m];
//                 nums[m] = nums[l];
//                 nums[l] =temp;
//                 m++;
//                 l++;
//             }
//             else{
//                 m++;
//             }

//         }


        
//     }
// }