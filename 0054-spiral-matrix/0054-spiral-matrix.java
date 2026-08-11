class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int col = matrix[0].length;
        int row = matrix.length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col -1;
        int k = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while(top <= bottom && left<=right){

            for(int i = left ; i<=right ; i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int j = top ; j<=bottom ; j++){
                res.add(matrix[j][right]);
            }
            right--;

            if(top<=bottom){
                for(int i = right ; i>=left ; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i>=top ; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }
        return res;
        
    }
}