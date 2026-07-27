class Solution {
    public int romanToInt(String s) {

        int res = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        for(int i = 0 ; i<s.length()-1 ;i++){
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            
            if(map.get(curr)>=map.get(next)){
                res+=map.get(curr);
            }
            else{
                res-=map.get(curr);
            }
        }

        res+=map.get(s.charAt(s.length()-1));
        return res;
        
    }
}