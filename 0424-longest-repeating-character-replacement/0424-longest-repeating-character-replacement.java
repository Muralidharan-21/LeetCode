class Solution {
    public int characterReplacement(String s, int k) {

        int res = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        int left = 0;

        for(int right = 0 ; right<s.length() ; right++){

            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);


            while( (right-left+1)-maxFreq > k ){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            res = Math.max(right-left+1,res);


        }
        return res;
        
    }
}


// class Solution {
//     public int characterReplacement(String s, int k) {

        
//         int ans = 0;
      
//         for(int i = 0 ; i<s.length();i++){
//             int maxFreq = 0;
//             int[] freq = new int[26];
//             for(int j = i ; j<s.length() ; j++){

//                 freq[s.charAt(j)-'A']++;
//                 maxFreq = Math.max(maxFreq,freq[s.charAt(j)-'A']);

//                 if((j-i+1)-maxFreq<=k){
//                     ans = Math.max(ans,j-i+1);
//                 }
     

//             }

//         }
//         return ans;
        
//     }
// }



// class Solution {
//     public int characterReplacement(String s, int k) {

//         int freq[] =new int[26];
//         int max = 0;
//         int res = 0;


//         int left = 0;
//         for(int right = 0; right<s.length() ;right++){

//             char ch = s.charAt(right);
//             freq[ch-'A']++;
//             max = Math.max(freq[ch-'A'],max);

//             while( (right-left+1)-max >k ){
//                 freq[s.charAt(left)-'A']--;
//                 left++;
//             }
//             res = Math.max((right-left+1),res);
//         }
//         return res;
        
//     }
// }


