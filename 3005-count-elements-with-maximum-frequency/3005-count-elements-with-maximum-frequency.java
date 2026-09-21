class Solution {
    public int maxFrequencyElements(int[] nums) {

        int max = 0;

        for(int x : nums){
            max = Math.max(x,max);
        }


        int[] freq = new int[max+1];
        int max_freq = 0; 
        for(int i = 0; i<nums.length ; i++){
            freq[nums[i]]++;
            max_freq = Math.max(max_freq,freq[nums[i]]);
        }

        int count = 0;

        for(int x : freq){
            if(x==max_freq){
                count+=x;
            }
        }


        return  count;



        
    }
}






// class Solution {
//     public int maxFrequencyElements(int[] nums) {

//         int[] freq = new int[101]; 

//         for(int i: nums){
//             freq[i]++;
//         }

//         int max = 0;

//         for(int i = 1 ;i<=100;i++){
//             if(freq[i]>0){
//                 max = Math.max(max,freq[i]);
//             }
//         }
//         int count = 0;
//         for (int i = 1; i<=100;i++){
//             if(freq[i]==max){
//                 count++;
//             }
//         }
//         return count * max;
     
        
//     }
// }