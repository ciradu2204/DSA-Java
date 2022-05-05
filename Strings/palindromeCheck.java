class PalindromeCheck{
    public static void main(String[] args) {
        
    /* 
    Write a function that takes non empty string and returns a boolean representing whether a string is a palindrome. 
    
    What is a palindrome? 
    A palindrome is defined as a string that's written the same forward and backward. Note that single character strings are palindrome. 
    
    Example 1: 
    Input: "abcdcba"
    Output: true; 
    
    Example 2: 
    Input: a
    Output: true; 
    **/
    
    //Solution 1: Loop through the element backward -> O(n) time complexity and O(n) space

    String input =  "abcdcba"; 
    
    boolean result1 = isPalidromeSolution1(input); 
    System.out.println(result1);

    // Solution 2 = Loop through both backward and forward at the same time using pointers-> O(n) time complexity and O(1) space
    boolean result2 = isPalidromeSolution2(input); 
    System.out.println(result2);

        
    }



    public static boolean isPalidromeSolution1(String input){

    StringBuilder stringBuilder = new StringBuilder(); 

    for(int i=input.length()-1; i>=0; i-- ){
       stringBuilder.append(input.charAt(i)); 
    }

    if(stringBuilder.toString().equals(input)){
        return true; 
    }

    return false;
    }

    public static boolean isPalidromeSolution2(String input){

    int pointer1 = 0; 
    int pointer2 = input.length() -1;
    

     while(pointer1 < pointer2){

        char pointer1Char = input.charAt(pointer1); 
        char pointer2Char = input.charAt(pointer2); 

        if(pointer1Char != pointer2Char){
             return false;

        }

        pointer1++; 
        pointer2--; 
     }

     return true; 


    }


}





