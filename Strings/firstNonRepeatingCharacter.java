import java.util.HashMap;

public class firstNonRepeatingCharacter {

    /**
     * Write a function that takes in a string of lowercase English-Alphabet letters and returns the index of the 
     * string of the non-repeating character
     * 
     * The first non-repeating character is a string that occurs only once
     * If the string does not have non-repeating characters, your function should return -1. 
     * 
     * Example 1: 
     * input: "abcdcaf"
     * 
     * Solution 1: O(n2) time complexity with O(1) space complexity- two loops
     * Solution 2: O(n) with time complexity with O(n) space complexity - HashMap 
     * Solution 3: O(nlogn) time complexity with O(1) space complexity - sorting
     * Solution 4: O(n) 
     * 
     */


    public static void main(String[] args) {


        String input = "abcdcaf";
        int result = Solution(input); 
        System.out.println(result);
        
    }

    public static int  Solution(String input){
        
        HashMap<Character, Integer> map = new HashMap<>(); 

        for(int i=0; i<input.length(); i++){
            int count = 1; 
            if(map.containsKey(input.charAt(i))){

                count = map.get(input.charAt(i)); 
                count = count + 1; 
            }
            map.put(input.charAt(i), count); 
        }


        for(int i=0; i< input.length(); i++){


            if(map.get(input.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
    
}
