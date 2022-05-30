class Solution {
    public int uniquePaths(int m, int n) {
        
         int[][] dp = new int[m][n]; 
                         
          //last row;                       
          for(int i=0; i< n; i++){
            dp[m-1][i] = 1; 
          }
                                 
          //last column; 
                                 
          for(int i=0; i< m; i++){
              dp[i][n-1] = 1; 
          }
                                 
           for(int i= m-2; i>=0; i--){

               for(int j=n-2; j>=0; j--){
                   
                   dp[i][j] = dp[i+1][j] + dp[i][j+1];
               }
           }
                                 
          return dp[0][0];
   
//         int uniquePaths = 0; 
//         findUniquePaths(m, n, 0, 0, uniquePaths); 
        
//         return uniquePaths;
    
    }
    
//     public void findUniquePaths(int m, int n, int x, int y, int uniquePaths){
//      if(x == m-1 && y == n-1){
//       uniquePaths++; 
//       return;
//     }
    
//     if(x >=m || y >= n){
//         return; 
//     }
    
//     findUniquePaths(m, n, x+1, y, uniquePaths); 
    
//     findUniquePaths(m, n, x, y+1, uniquePaths); 
//     }
    
    
    /*
    
    the robot can only move bottom or right at any point in time
    check for boundaries - when it has reached to the end of bottom or end of right
    int uniquePaths = 0; 
 
    
    
    */
}