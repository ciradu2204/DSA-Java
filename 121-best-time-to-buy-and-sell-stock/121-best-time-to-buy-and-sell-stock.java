class Solution {
    public int maxProfit(int[] prices) {
       
        /**
        //brute force
        int profit  = 0; 
          for(int i=0; i<prices.length; i++){
     
          for(int x=i+1; x<prices.length; x++){
          
               if((prices[x] - prices[i]) > profit){
                 profit = prices[x] - prices[i]; 
               }
          }
     
        }
        return profit;
        **/ 
        //one pass 
        
        int maxProfit = 0; 
        int minPrice = Integer.MAX_VALUE; 
        
          for(int i=0; i<prices.length; i++){
              //check if the current element is less than the minPrice
              
              if(prices[i] < minPrice){

                  minPrice = prices[i]; 
              }else if(prices[i ] - minPrice > maxProfit){
             
                  maxProfit = prices[i] - minPrice; 
              }
              
          }
        
        return maxProfit; 
        
    }
    
    
    /*
    
    
    An array: prices
    price: 7
    prices = [7,1,5,3,6,4]
              0 1 2 3 4 5
       
    return the maximum profit 
     
             [7,6,4,3,1]
             
     return maximum profit = 0; 
     profit = 0; 

     
     for(int i=0; i<prices.length; i++){
     
          for(int x=0; x<prices.length; x++){
          
               if(price[x] -prices[i] > profit){
                 profit = prices[x] - price[i]; 
               }
          }
     }
              
              []
    
    
    
    */
}