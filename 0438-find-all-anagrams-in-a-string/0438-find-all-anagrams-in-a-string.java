class Solution {
    public List<Integer> findAnagrams(String s, String p) {


        ArrayList<Integer> arr = new ArrayList<>();
        char[] pp = p.toCharArray();
        Arrays.sort(pp);

        for(int i = 0 ; i<= s.length() - p.length() ;i++){

            String sub = s.substring(i,i+p.length());
            char[] temp = sub.toCharArray();
            Arrays.sort(temp);

            if(Arrays.equals(temp,pp)){
                arr.add(i);
            }
        }
        return arr;
        
    }
}