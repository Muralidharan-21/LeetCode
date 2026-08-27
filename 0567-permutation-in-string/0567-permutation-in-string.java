class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);

        for(int i = 0 ; i<= s2.length()-s1.length() ; i++){

            String window = s2.substring(i,i+s1.length());
            char[] ch2 = window.toCharArray();
            Arrays.sort(ch2);

            if(Arrays.equals(ch2,ch1)){
                return true;
            }

        } 
        return false;
        
    }
}