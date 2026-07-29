class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        int l = flowerbed.length;

        for(int i = 0; i<l ;i++){

            boolean curEmpty = flowerbed[i] == 0;
            boolean leftEmpty = i == 0 || flowerbed[i-1] == 0 ;
            boolean rightEmpty =    i == l-1 || flowerbed[i+1] == 0 ;

            if(curEmpty && leftEmpty && rightEmpty){
                flowerbed[i] = 1;
                n--;
            } 
        }
        return n<=0;

        
        
    }
}