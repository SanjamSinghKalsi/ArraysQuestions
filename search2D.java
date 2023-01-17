class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        int check = 0;
      //  while(lengthRow)

        for(int i=0;i<matrix.length;i++){
            if(matrix[i][n]>=target){
                 check = i;
                 break;
            }
        }
        for(int i=0;i<=n;i++){
            if(matrix[check][i]==target){
                return true;
            }
        }
        return false;
    }
}
