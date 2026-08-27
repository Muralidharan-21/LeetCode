class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] need = new char[26];
        for(char x : s1.toCharArray()){
            need[x-'a']++;
        }
        char[] window = new char[26];

        int left =0 ;
        
        for(int right = 0 ; right<s2.length() ;right++){
            window[s2.charAt(right)-'a']++;
            if(right-left+1 == s1.length()){
                if(Arrays.equals(need,window)){
                    return true;
                }
                window[s2.charAt(left)-'a']--;
                left++;
            }
        }
        return false;
        
    }
}




// class Solution {
//     public boolean checkInclusion(String s1, String s2) {

//         char[] ch1 = s1.toCharArray();
//         Arrays.sort(ch1);

//         for(int i = 0 ; i<= s2.length()-s1.length() ; i++){

//             String window = s2.substring(i,i+s1.length());
//             char[] ch2 = window.toCharArray();
//             Arrays.sort(ch2);

//             if(Arrays.equals(ch2,ch1)){
//                 return true;
//             }

//         } 
//         return false;
        
//     }
// }