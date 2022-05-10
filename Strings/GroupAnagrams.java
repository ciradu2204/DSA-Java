import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class GroupAnagrams {

     /**
      * Write a function that takes in an array of Strings and groups anagrams together.
        Anagrams are strings made up extractly the same letters, where order does not matter.
        Forexample, "cinema" and "iceman" are anagrams; similary "foo" and "ofo" are anagrams. 
        Your function should return a list of anagrams groups in no particular order

        Example 1: 
        input: "words": ["yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"]
        output: [["foo"],["flop", "olfp"],["oy", "yo"],["act", "cat", "tac"]]

        Solution 1: w*nlog(n) time complexity and O(n*w) of space complexity where w is the number of words given and n is the length of the longest word
        Solution 2: 
      */

      public static void main(String[] args) {

        List<String> input = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
         Solution1(input);
 
          
      }

      public static List<List<String>> Solution1(List<String> words){
          
        HashMap<String, List<String>> map = new HashMap<>(); 
         List<String> sortedWords  = new ArrayList<>();
         List<List<String>> result = new ArrayList<>();

         //sorting each word 
        for(int i=0; i<words.size(); i++){

            char[] currentWord = words.get(i).toCharArray();
            Arrays.sort(currentWord);
            String sortedWord = String.valueOf(currentWord);
             sortedWords.add(sortedWord);

        }


        //group the words using a hashtable 
        for(int i=0; i<sortedWords.size(); i++){

            List<String> list = new ArrayList<>(); 
            if(map.containsKey(sortedWords.get(i))){

                list = map.get(sortedWords.get(i));
                list.add(words.get(i));
            }else{
                list.add(words.get(i));
            }

            map.put(sortedWords.get(i), list);

        }

        //add the words in the list 
        for(List<String> object : map.values()){
            result.add(object);
        }
 

       return result;
      }


      public static List<List<String>> Solution1Refactored(List<String> words){


        HashMap<String, List<String>> map = new HashMap<>(); 
 
        for(int i=0; i<words.size(); i++){

            char[] currentWord = words.get(i).toCharArray();
            Arrays.sort(currentWord);
            String sortedWord = String.valueOf(currentWord);
 
            if(map.containsKey(sortedWord)){

                map.get(sortedWord).add(words.get(i));
            }else{
                map.put(sortedWord, new ArrayList<String>(Arrays.asList(words.get(i))));
            }

        }



       return  new ArrayList<>(map.values());
      }
    
}
