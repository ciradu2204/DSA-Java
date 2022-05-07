import java.util.ArrayList;
import java.util.List;

public class longestPalidromeString {

  /**
   * Write a function that, given a string, returns its longest palindromic substring.
   * A palidrome is defined as a string that's written the same forward and backward. Note that single character strings are palidromes. 
   * You can assume that there will only be one longest palindrome substring
   * 
   * Example 1: 
   * input: abaxyzzyxf
   * ouput: xyzzyx
   * Example 2: 
   * input: a
   * output: a
   * 
   * Solution 1: O(n3) time complexity with O(1) space complexity - three nested loops
   * Solution 2: O(n2) time complexity with O(n) space complexity
    */
    public static void main(String[] args) {

        String input = "abaxyzzyxf"; 
        String result = Solution2a(input); 
        System.out.println(result);


        String result2 = Solution2b(input); 
        System.out.println(result2);
        
    }

    public static String Solution2b(String str){

        String longest = "";

        for(int i=0; i<str.length(); i++){


            //loop through assuming the palidrome choice is different character fom i 
            String first =  findPalindromeFrom(i-1, i, str);
            //loop through assuming the palidrome choice is at the same character as i 
            String second = findPalindromeFrom(i-1, i+1, str);

            String currentLongest = first.length() > second.length()? first: second;

            longest = (longest.length() < currentLongest.length())? currentLongest: longest; 

        }


        return longest; 

    }


    public static String Solution2a(String str){


        List<String> list =  new ArrayList<>();

        String longest = ""; 

        for(int i=0; i<str.length(); i++){

            //starting from i because a single character can be considered a palindrome 
            //str.length -1 to avoid going  out of index when find the
            for(int x=i; x<=str.length()-1; x++){

                if(str.charAt(i) == str.charAt(x)){
                    list.add(str.substring(i, x+1));
                }
            }
        }


        for(int i=0; i<list.size(); i++){

            String current = list.get(i); 
            if(PalindromeCheck.isPalidromeSolution1(list.get(i))){

                longest = (longest.length() < current.length())? current: longest; 
            }

        }

        return longest;


    }


    public static String findPalindromeFrom(int start, int end, String str){



        while(start >= 0 && end <str.length()){

            if(str.charAt(start) != str.charAt(end)){
                break;
            }
            start--; 
            end ++; 
        }

        return str.substring(start+1, end);
    }
    
}
