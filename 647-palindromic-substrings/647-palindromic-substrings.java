class Solution {
    public int countSubstrings(String s) {
    
      int result = 0; 
      for(int i=0; i<s.length(); i++){
          int left = i; 
          int right = left; 
          result += countPalidrome(s, left, right); 
        
          
          left= i; 
           right = left+1; 
          result += countPalidrome(s, left, right);  
        
      }
        
    return result;
        
    }
    
    public int countPalidrome(String s, int p1,  int p2){
        int result = 0;
        while(p1>= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)){
           result++; 
           p1--; 
           p2++; 
        }
        
        return result; 
        
    }
    
   
    
    /* 
    
    Given a string: "abc"
    A palidrome: reads the same forward and backward
    Output: int -> number of palidrome
    
 

   1. Edge case: p1 == p2 return 1, p1>p2 return 0; 
   
    
    
    
    
    */
}