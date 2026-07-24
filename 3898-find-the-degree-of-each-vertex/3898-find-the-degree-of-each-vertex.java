class Solution {
    public int[] findDegrees(int[][] matrix) {
        
        int[] ans = new int[matrix.length];

        for(int i = 0 ; i < matrix.length ; i++){
            int temp = 0;
            for(int j = 0 ; j < matrix.length ; j++){
                temp+= matrix[i][j];
            }
            ans[i] = temp;
        }

        return ans;

    }
}