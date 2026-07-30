class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> arr = new ArrayList<>();
        char patern[] = p.toCharArray(); 
        Arrays.sort(patern);

        for(int i = 0 ; i<= s.length()-p.length() ; i++){


            String sub = s.substring(i,i+p.length());
            char ss[] = sub.toCharArray();
            Arrays.sort(ss);

            if(Arrays.equals(ss,patern)){
                arr.add(i);
            }


        }
        return arr;
        
    }
}