class Solution {
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs,(a,b)->(a[1]-a[0])-(b[1]-b[0]));

        int n = costs.length/2;

        int total = 0;
        for(int i = 0; i<costs.length;i++){
            if(i<n){
                total+=costs[i][1];
            }
            else{
                total+=costs[i][0];
            }
        }

        return total;
        
    }
}