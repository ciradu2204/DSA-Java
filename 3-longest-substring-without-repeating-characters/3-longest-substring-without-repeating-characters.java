class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int pointer1 = 0; 
        int pointer2 = 0; 
        int maxLength = Integer.MIN_VALUE; 
        HashMap<Character, Integer> set = new HashMap<Character, Integer>(); 
        while(pointer2 < s.length()){
             int currentLength = pointer2 - pointer1; 
              set.put(s.charAt(pointer2), set.getOrDefault(s.charAt(pointer2),0) + 1);      

            if(set.get(s.charAt(pointer2)) > 1 && currentLength > maxLength ){
                maxLength = currentLength;   
             }        
        
             while(set.get(s.charAt(pointer2)) > 1){
                set.put(s.charAt(pointer1), set.get(s.charAt(pointer1)) -1); 
                pointer1++; 
            }
               
            
            pointer2++; 
            
        }
        
        maxLength = (pointer2 - pointer1 > maxLength)? pointer2-pointer1: maxLength; 
        return  (maxLength == Integer.MIN_VALUE)?  0: maxLength ;
        
    }
    
  
    
    /* 
    
    Given: "abcabcbb"
    Output: length of the longest substring without repeating char -> 1 
    
    substring: 
    longest: 3
    set =  {a, b, c}
    a b c a b c b b
          p1
                p2
     
   
    
    Alg: sliding window
    
    1. two pointers start at 0
    2. create hashmap
    3. while pointer2 < arr.length, add element in hashmap
     3.a if element belongs in the set, find the length of pointer1, and pointer2-1
    5. increment pointer1
    
    
    */ 
}