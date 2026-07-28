class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int i = 0; i<nums.length;i++){

            int temp = 0;
            if(nums[i]!=0){
                temp = nums[k];
                nums[k++] = nums[i];
                nums[i] = temp;;

            }
        }


        
    }
}









// class Solution {
//     public void moveZeroes(int[] nums) {

//         int k = 0;

//         for(int i = 0; i<nums.length;i++){
//             if(nums[i]!=0){
//                 int temp = nums[i];
//                 nums[i] = nums[k];
//                 nums[k] = temp;
//                 k++;
//             }
//         }
     
        

//     }
// }