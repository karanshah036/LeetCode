//Time Complexity O(mxn)
//Space Complexity O(1)
class Solution {
    public int numEnclaves(int[][] grid) {
        int enclaves=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i==0 || i==grid.length-1 || j==0 || j==grid[0].length-1) && grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i!=0 || i!=grid.length-1 || j!=0 || j!=grid[0].length-1) && grid[i][j]==1){
                    enclaves++;
                }
            }
        }
        return enclaves;
    }
    public void dfs(int[][] grid, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return;
        }
        else{
            grid[row][col]=0;
            dfs(grid,row+1,col);
            dfs(grid,row-1,col);
            dfs(grid,row,col+1);
            dfs(grid,row,col-1);
        }
    }
}