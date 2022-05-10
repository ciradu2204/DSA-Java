import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class shortestWordEditPath {


    /**
     *Given two words source and target, and a list of words words, find the length of the shortest series of edits that transforms source to target.

      Each edit must change exactly one letter at a time, and each intermediate word (and the final target word) must exist in words.

      If the task is impossible, return -1.

      Example: 
      source = "bit", target = "dog"
      words = ["but", "put", "big", "pot", "pog", "dog", "lot"]

      output: 5
      Explanation: bit -> but -> put -> pot -> pog -> dog
     
      
      Solution1: O(n2) time complexity and O(1) space complexity
      
      //1.check if the source is not equal to target
      //2. Loop through the array
      //4. check if the length are equal
      //5. check the difference between two strings 

     */
    
     public static void main(String[] args) {

        String[] words = {"abc", "ab"};
        String source = "abc"; 
        String target = "ab";
 
        int result2 = Solution2(source, target, words);
        System.out.println(result2);


         
     }

 
 

 public static int Solution2(String startWord, String endWord, String[] wordList){

   

   HashSet<String> set = new HashSet<>(); 
   Queue<String> queue = new LinkedList<>(); 

   for(int i=0; i<wordList.length; i++){
       set.add(wordList[i]);
   }

   if(!set.contains(endWord)){
       return 0; 
   }

   int length = 1; 
   queue.add(startWord); 
 

   while(!queue.isEmpty()){

      int size = queue.size(); 

      for(int i=0; i<size; i++){
          
        String currentWord = queue.poll(); 

        char[] currentWordArray = currentWord.toCharArray(); 

        for(int x=0; x<currentWordArray.length; x++){
            
            char originalChar = currentWordArray[x]; 

            for(char j='a'; j <= 'z'; j++){

               if(currentWordArray[x] == j) continue;
               currentWordArray[x] = j;
               String newWord = String.valueOf(currentWordArray);

               if(newWord.equals(endWord)){
                   return length + 1;
               }else if(set.contains(newWord)){
                   queue.add(newWord);
                   set.remove(newWord);
               }
            }
           currentWordArray[x] = originalChar; 

        }
        length++;
        



      }

   }








   return 0; 


 }
}