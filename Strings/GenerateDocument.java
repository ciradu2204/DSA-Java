import java.util.HashMap;

public class GenerateDocument {

    /*
    You're given a string of available characters and a string representing a document that you need to generate. Write a function that determines if you can generate the document using the available characters. If you can generate the document, your function should return true; otherwise, it should return false.
    You're only able to generate the document if the frequency of unique characters in the characters string is greater than or equal to the frequency of unique characters in the document string. For example, if you're given characters = "abcabc" and
    document = "aabbccc" you cannot generate the document because you're missing one c.
    The document that you need to create may contain any characters, including special characters, capital letters, numbers, and spaces.
    Note: you can always generate the empty string("").

    Example 1: 

    Input:
    characters = "Bste!hetsi ogEAxpelrt x "
    document = "AlgoExpert is the Best!"

    Output: 
    true;

    Solution 1: O(n + m) time complexity with O(n) space complexity using hashmap where n is the number of characters and m is the number of characters in the document

    */

    public static void main(String[] args) {

        String characters = "Bste!hetsi ogEAxpelrt x "; 
        String document = "AlgoExpert is the Best!"; 
        boolean result = Solution1(characters, document);
        System.out.println(result);
    }

    public static boolean  Solution1(String character, String document){

        HashMap<Character, Integer> map = new HashMap<>(); 


        for(int i = 0; i<character.length(); i++){


            char lastVal = character.charAt(i);

            if(map.containsKey(character.charAt(i))){

                int count = map.get(character.charAt(i));
                count = count + 1; 
                map.put(character.charAt(i), count);

            }else{
                map.put(character.charAt(i), 1);

            }


        }

        for(int i=0; i<document.length(); i++) {


 
            if(!map.containsKey(document.charAt(i)) || (map.get(document.charAt(i)) == 0)){

                return false;

            }else{

                int count = map.get(document.charAt(i));
                count = count -1;
                map.put(document.charAt(i), count);

            }
            
        }


        return true;
    }
    
}
