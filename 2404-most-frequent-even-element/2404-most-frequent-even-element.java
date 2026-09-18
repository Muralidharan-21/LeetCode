class Solution {
    public int mostFrequentEven(int[] nums) {

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i : nums){
            if(i%2==0){
            map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int res = -1;
        int f = 0;

        for(int x : map.keySet()){

            if(map.get(x)>f){
                res = x;
                f = map.get(x);
            }
            else if(map.get(x)==f){
                if(x<res){
                    res = x;
                }
              
            }
          
        }
        return res;
        
    }
}