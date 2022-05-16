public class isPalindrome {


    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama"; 
        boolean isPalindrome = isPalindrome(s); 
        System.out.print(isPalindrome);
    }
    

        public static boolean isPalindrome(String s) {
            
             
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
            
            int value = Character.getNumericValue(letter); 
            
            if(value >= Character.getNumericValue('a')  && value <=               Character.getNumericValue('z')){
                return true; 
            }else if(value >= Character.getNumericValue('A')  && value <=     Character.getNumericValue('Z')){
                return true; 
            }else if(value >= Character.getNumericValue('0')  && value <= Character.getNumericValue('9')){
              return true; 
            }
            
            return false;
        }
    
}
