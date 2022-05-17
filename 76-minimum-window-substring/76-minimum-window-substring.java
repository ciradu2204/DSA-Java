class Solution {
    public String minWindow(String s, String t) {
        
    /*
    Input s= "ADOBECODEBANC"; 
    t = ABC
    
    Map = ['A': 0, 'B': 0, 'C': 0]
    string: 'BANC'
    
    **/
    
    HashMap<Character, Integer> window = new HashMap<>(); 
        
    for(int i=0; i<t.length(); i++){
        window.put(t.charAt(i), window.getOrDefault(t.charAt(i), 0) + 1); 
    }
        
    int have = 0; 
    int shortestStringLength = Integer.MAX_VALUE; 
    String shortestString = ""; 
    int leftPointer = 0; 
         
    for(int rightPointer=0; rightPointer < s.length(); rightPointer++){
        
     if(window.containsKey(s.charAt(rightPointer))){
                                     window.put(s.charAt(rightPointer),window.getOrDefault(s.charAt(rightPointer), 0) -   1); 
            
        if(window.get(s.charAt(rightPointer)) == 0 ){
              have += 1;   
        }
        } 
           
         while(have == window.size()){
            
            String currentShortest= s.substring(leftPointer, rightPointer +1); 
             
             if(currentShortest.length() < shortestStringLength ){
                 shortestStringLength = currentShortest.length(); 
                 shortestString = currentShortest; 
             }
             
             if(window.containsKey(s.charAt(leftPointer))){
                 window.put(s.charAt(leftPointer), window.get(s.charAt(leftPointer))+1); 
                 
                 if(window.get(s.charAt(leftPointer)) > 0){
                     have--; 
                 }
             }
             

             leftPointer++; 
             
         }
    } 
     
  return shortestString;   
 }
}