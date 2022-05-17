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
    int start = 0; 
    int leftPointer = 0; 

    for(int rightPointer=0; rightPointer < s.length(); rightPointer++){
        
     if(window.containsKey(s.charAt(rightPointer))){
                                            window.put(s.charAt(rightPointer),window.getOrDefault(s.charAt(rightPointer), 0) -   1); 
            
        if(window.get(s.charAt(rightPointer)) == 0 ){
              have += 1;   
        }
        } 
           
         while(have == window.size()){
            
             if((rightPointer - leftPointer) + 1 < shortestStringLength ){
                 shortestStringLength = (rightPointer - leftPointer) + 1; 
                 start = leftPointer; 
              }
             
             if(window.containsKey(s.charAt(leftPointer))){
                 window.put(s.charAt(leftPointer),       window.get(s.charAt(leftPointer))+1); 
                 
                 if(window.get(s.charAt(leftPointer)) > 0){
                     have--; 
                 }
             }
             
             
             leftPointer++; 
             
         }
    } 
     
 
  return (shortestStringLength > s.length())? "": s.substring(start, start + shortestStringLength);   
 }
}