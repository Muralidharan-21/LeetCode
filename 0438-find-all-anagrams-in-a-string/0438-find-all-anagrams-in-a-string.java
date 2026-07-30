class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int pat[] = new int[26];
        int win[] = new int[26];

        ArrayList<Integer> arr = new ArrayList<>();

        for(char x : p.toCharArray()){
            pat[x-'a']++;
        }
        int winSize = p.length();
        if(p.length()>s.length()){
            return arr;
        }
        for(int i = 0 ; i<winSize ; i++){
            win[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pat,win)){
            arr.add(0);
        }

        for(int i = winSize; i<s.length();i++){

            win[s.charAt(i)-'a']++;
            win[s.charAt(i-winSize)-'a']--;

            if(Arrays.equals(pat,win)){
                arr.add((i-winSize)+1);
            }

        }
        return arr;
        
    }
}





// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {


//         ArrayList<Integer> arr = new ArrayList<>();
//         char[] pp = p.toCharArray();
//         Arrays.sort(pp);

//         for(int i = 0 ; i<= s.length() - p.length() ;i++){

//             String sub = s.substring(i,i+p.length());
//             char[] temp = sub.toCharArray();
//             Arrays.sort(temp);

//             if(Arrays.equals(temp,pp)){
//                 arr.add(i);
//             }
//         }
//         return arr;
        
//     }
// }