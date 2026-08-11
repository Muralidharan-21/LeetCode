class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        int[] res = new int[row*col];

        int k = 0;

        for(int d = 0 ; d<= row+col-2 ; d++){
            if(d%2==1){
                for(int r = 0 ; r<row ;r++){
                    int c = d - r;
                    if(c>=0 && c<col){
                    res[k++] = mat[r][c];
                    }
                }
            }
            else{
                for(int r = row - 1; r>=0 ; r--){
                    int c = d - r;
                    if(c>=0 && c<col){
                        res[k++]=mat[r][c];
                    }
                }

            }
            
        }
        return res;

        
    }
}