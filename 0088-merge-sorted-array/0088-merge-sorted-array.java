class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m+n-1;
        int n1 = m-1;
        int n2 = n-1;

        while(n1>=0 && n2>=0){
            if(nums1[n1]>nums2[n2]){
                nums1[p--] = nums1[n1--];
            }
            else{
                nums1[p--] = nums2[n2--];
            }
        }

        while(n2>=0){
            nums1[p--] = nums2[n2--];
        }

        
    }
}
















// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int pos = m + n -1;
//         int j = n - 1;
//         int i = m - 1;


//         while(i >=0 && j>=0 ){
//             if(nums1[i]>nums2[j]){
//                 nums1[pos--] = nums1[i--];
//             }
//             else{
//                 nums1[pos--] = nums2[j--];
//             }
//         }

//         while(j>=0){
//             nums1[pos--]=nums2[j--];
//         }
        
//     }
// }