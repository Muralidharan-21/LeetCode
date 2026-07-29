class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int l = flowerbed.length;

        if(l==1 && flowerbed[0]==0){
            return true;
        }
        

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0] = 1;
            n--;
        }
        if(flowerbed[l-1]==0 && flowerbed[l-2]==0){
            n--;
            flowerbed[l-1] = 1;
        }

        for(int i =1;i<l-1;i++){
            if(flowerbed[i]==0){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n<=0;
        
    }
}