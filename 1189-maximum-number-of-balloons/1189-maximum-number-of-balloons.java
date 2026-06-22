class Solution {
    public int maxNumberOfBalloons(String text) {

        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int count = 0;
        for(char ch : text.toCharArray()){
            if(ch == 'b'){
                b++;
            }
            if(ch == 'a'){
                a++;
            }
            if(ch == 'l'){
                l ++ ;
            }
            if(ch == 'o'){
                o ++ ;
            }
            if(ch == 'n'){
                n ++ ;
            }


        }
        return Math.min(b,Math.min(a,Math.min(n,Math.min(l/2 , o/2))));
    }
}