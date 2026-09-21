class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();


        for(int x : nums1){
            s1.add(x);
        }
        for(int x : nums2){
            if(s1.contains(x)){
                s2.add(x);
            }
        }

        int[] arr = new int[s2.size()];
        int p = 0 ; 
        for(int x : s2){
            arr[p++] = x;
        }

        return arr;




        
    }
}





// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {

//         HashSet<Integer> arr = new HashSet<>();
//         HashSet<Integer> res = new HashSet<>();

//         for(int nums : nums1){
//             arr.add(nums);
//         }
//         for( int num : nums2){
//             if(arr.contains(num)){
//                 res.add(num);
//             }
//         }

//         int[] result = new int[res.size()];
//         int p = 0;

//         for(int x : res){
//             result[p++]=x;
//         }
//         return result;
        
//     }
// }