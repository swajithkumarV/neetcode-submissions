class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int m = matrix.length;
int n = matrix[0].length;
        int right = m*n-1;
        while(left<= right){
            int mid = left+(right-left)/2;
            int col = mid%n;
            int row = mid/n;
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}
