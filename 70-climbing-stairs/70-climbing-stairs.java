class Solution {
    public int climbStairs(int n) {
       
        int one = 1; 
        int two = 1; 
        
        for(int i = 1; i <n; i++){
            int temp = one; 
            one  = one + two; 
            two = temp;   
        }
        
        return one; 
        
       
    }
    
     public void climbStairsHelper(int n, int[] dp){
         
        if(n == 1){
           dp[1] = 1; 
        } 
        
        if(n == 2){
          dp[2] =  2; 
        }
        
        dp[n]  = dp[n-2] + dp[n-1]; 
     }
    
    //each time you can climb 1 or 2 steps
    
    //if (n == 1) 1
    // if (n == 2) 2
    // if(n == 0) 0
    
}