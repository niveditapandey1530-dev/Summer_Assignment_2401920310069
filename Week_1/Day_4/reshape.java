class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] ans=new int[r][c];
        int  []ans2=new int[r*c];
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n) return mat;
        int p=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans2[n*i+j]=mat[i][j];
            }
        }
        int len=ans2.length;
         for(int i=0;i<ans2.length;i++){
            ans[i/c][i%c]=ans2[i];
         }

        return ans;
    }
}
