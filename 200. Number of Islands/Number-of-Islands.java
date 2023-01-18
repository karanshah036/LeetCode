// Time Complexity O(M x N)
// Space Complexity O(M x N)
class Solution {
    public int numIslands(char[][] grid) {
        int numIslands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    public void dfs(char[][] grid,int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0') return;
        else{
            grid[row][col]='0';
            dfs(grid,row+1,col);
            dfs(grid,row-1,col);
            dfs(grid,row,col+1);
            dfs(grid,row,col-1);
        }
    }
}