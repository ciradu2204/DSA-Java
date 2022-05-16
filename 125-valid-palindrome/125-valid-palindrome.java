class Solution {
    public boolean isPalindrome(String s) {
        
         
        //change to lowercase 
        String current = s.toLowerCase(); 
 
        //if string is <=1  -> return true; 
        if(current.length() <=1){
            return true;
        }
        
          int pointer1 = 0; 
          int pointer2 = current.length() - 1; 
   
                while(pointer1 < pointer2){
                  
                
                  while(pointer1 < pointer2 && !isAlphaNum(current.charAt(pointer1))){
                    pointer1++; 
                  }
                 
    
                  while(pointer2 > pointer1 && !isAlphaNum(current.charAt(pointer2)) ){
                      pointer2--; 
                  }
                  
                  if(current.charAt(pointer1) != current.charAt(pointer2)){
    
                        return false; 
                  }
                  
                  pointer1++; 
                  pointer2--; 
              }
         
        
        
        return true; 
        
    }
    
    public static boolean isAlphaNum(char letter){
        
        int value = letter; 
        int a = 'a'; 
        int z = 'z'; 
        
        int A = 'A'; 
        int Z = 'Z'; 
        
        int number0 = '0'; 
        int number9 = '9';
         
        if(value >= a  && value <= z){
            return true; 
        }else if(value >= A  && value <= Z){
            return true; 
        }else if(value >= number0  && value <= number9){
          return true; 
        }
        
        return false;
    }
}

 