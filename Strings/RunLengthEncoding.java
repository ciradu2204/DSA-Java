/**
Given an input string, write a function that returns the Run Length Encoded string for the input string. For example, if the input string is AABBBCCCC, then the function should return A2B3C4.
Example 1: 
Input = AAAAAAAAAADDDCC
Ouput = 9A3D2C


//Solution 1: O(N) -> Time complexity 
- loop through the element keeping track of the last visited element
- if the last visited element is different from the current element, save the count and append it to the new element
 */

public class RunLengthEncoding{

    public static void main(String[] args) {

        String input = "AAAAAAAAAAAAABBCCCCDD";
        String result = Solution1(input);
        System.out.println(result);

        String result2 = solution2(input); 
        System.out.println(result2);
        
    }

    public static String Solution1(String input){

        StringBuilder stringBuilder = new StringBuilder(); 

        int count = 1; 
        char prev = input.charAt(0); 
        for(int i=1; i<input.length(); i++){
            
            

            if(prev == input.charAt(i) && count < 10){
                count +=1;
            }else if(prev == input.charAt(i) && count >= 10){
                stringBuilder.append(9); 
                stringBuilder.append(prev); 

                count = count - 9 +1; 
                
            }else if(prev != input.charAt(i) && count <10){
                stringBuilder.append(count); 
                stringBuilder.append(prev); 
                count = 1; 
                prev = input.charAt(i); 
            }else if(prev != input.charAt(i) &&  count >=10){
                stringBuilder.append(9); 
                stringBuilder.append(prev); 
                stringBuilder.append(count-9); 
                stringBuilder.append(prev);
                count = 0; 
                prev = input.charAt(i); 

            } 

        }


        if(count >=10){
        stringBuilder.append(9); 
        stringBuilder.append(prev);
        count = count -9;
        }
        stringBuilder.append(count); 
        stringBuilder.append(prev); 
        return stringBuilder.toString();


    }


    public static String solution2(String input){

        //simplified version of solution2 
        StringBuilder stringBuilder = new StringBuilder(); 

        int count = 1; 
        char prev = input.charAt(0); 
        for(int i=1; i<input.length(); i++){


            if((prev != input.charAt(i)) || (count == 9)){
                stringBuilder.append(count); 
                stringBuilder.append(prev);
                count = 0;
                prev =  (prev != input.charAt(i))? input.charAt(i): prev;
            }
            
            count +=1;
           

        }

        stringBuilder.append(count); 
        stringBuilder.append(prev); 
        return stringBuilder.toString();

    }




}