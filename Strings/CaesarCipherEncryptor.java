import java.util.HashMap;

/** 
 * Question: 
 * Given a non-empty String of lower case letters and non-negative integer representing a key, write function that returns a new string 
 * obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key. 
 * 
 * Note that letters should wrap around the alphabet, in other words, the letter z shifted by one returns the letter a. 
 * 
 * Example 1: 
 * input = "xyz"; 
 * output = zab;
 * 
 * Example 2: 
 * input = "abcd"
 * output = "cdef"
 *
 * 
 */

 public class CaesarCipherEncryptor{

    public static void main(String[] args) {

        String input = "abc"; 
        int key = 52; 
        //1 solution: O(n) time complexity and O(n) space complexity
        String result = solution1(input, key); 
        System.out.println(result);


        //2 Solution: O(n) time complexity and O(n) space complexity
        String result2 = Solution2(input, key); 
        System.out.println(result2);
        
    }


    

    public static String solution1(String input, int k){

        //get the numerical representaion 
        HashMap<Integer, Character> map = new HashMap<>(); 

        //Build the new string
        StringBuilder stringBuilder = new StringBuilder(); 

        for(int i= 97; i<=122; i++){

            char value = (char)  i; 

            map.put(i, value); 
        }

    
        for(int i = 0; i<input.length(); i++){

            char current = input.charAt(i); 

            int value = current;

            int newValue = value + k; 


            //continue looping until the value is the range of 97- 122
            while(newValue > 122){

              int difference = newValue - 122; 
              newValue = 97 + (difference -1);

            }

            char characterNewValue =  (char) map.get(newValue); 

            stringBuilder.append(characterNewValue);
        }

        return stringBuilder.toString();


    }

    public static String Solution2(String input, int key){

        //calculate the number of rotation
        int nOfRotation = key%26;

        String one = "abcdefghijklmnopqrmnopqrstuvwxyz"; 
        StringBuilder stringBuilder = new StringBuilder(); 

        
        for(int i = 0; i<input.length(); i++){

            char current = input.charAt(i); 

            int value = one.indexOf(current); 

            int newValue = value + nOfRotation; 

            if(newValue > one.length()){
                int difference = one.length() - newValue; 
                newValue = 0 + difference -1;
            }

            char characterNewValue =  (char) one.charAt(newValue); 
            stringBuilder.append(characterNewValue);



        }

        return stringBuilder.toString();
 

    }




 }