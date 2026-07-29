class Solution {
    public int characterReplacement(String s, int k) {

        int freq[] = new int[26];

        int left = 0;
        int max_freq = 0;
        int res = 0;

        for(int right = 0; right<s.length();right++){

            char ch = s.charAt(right);

            freq[ch-'A']++;
            max_freq = Math.max(freq[ch-'A'],max_freq);

            while( (right-left+1) - max_freq >k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            // freq[ch-'A']++;
            // max_freq = Math.max(freq[ch-'A'],max_freq);
            res = Math.max(right-left+1,res);
        }
        return res;

        
    }
}


















// class Solution {
//     public int characterReplacement(String s, int k) {

//         int[] freq = new int[26];

//         int res = 0;
//         int max_freq = 0;
//         int left = 0;

//         for(int right = 0 ; right<s.length() ; right++){

//             char ch = s.charAt(right);
//             freq[ch-'A']++;
//             max_freq = Math.max(max_freq,freq[ch-'A']);

//             while((right-left+1) - max_freq > k){
//                 freq[s.charAt(left)-'A']--;
//                 left++;
//             }

//             res = Math.max(right-left+1,res);

//         }
//         return res;
        
//     }
// }