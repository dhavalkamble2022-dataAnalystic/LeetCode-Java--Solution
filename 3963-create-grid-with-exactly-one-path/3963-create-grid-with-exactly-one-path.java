class Solution {
    public String[] createGrid(int m, int n) {
        String [] grid=new String[m];
        String r1=".".repeat(n);
        grid[0]=r1;
        String r="#".repeat(n-1)+".";
        for(int i=1; i<m; i++)
        {
            grid[i]=r;
        }
        return grid;
        
    }
}