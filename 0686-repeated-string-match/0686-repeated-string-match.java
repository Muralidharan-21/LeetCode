class Solution {
    public int repeatedStringMatch(String a, String b) {

        String x = a;
        int count = 1;
        if(a.contains(b)){
            return 1;
        }

        for(int i = 0 ; x.length()<b.length() ; i++){
            x += a;
            count+=1;
            if(x.contains(b)){
                return count;
            }
            
        }

        x+=a;
        count++;
        if(x.contains(b)){
            return count;
        }
        return -1;
        
    }
}