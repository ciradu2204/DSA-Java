class Trie {

    Node node; 
    public Trie() {
     
    node = new Node(); 
        
        
    }
    
    public void insert(String word) {
        
        
        Node currentCharacter = node;       
        for(int i=0; i<word.length(); i++){
            
             if(!currentCharacter.children.containsKey(word.charAt(i))){
                    currentCharacter.children.put(word.charAt(i), new Node());

             }

              currentCharacter  = currentCharacter.children.get(word.charAt(i)); 

                
        }
        
        currentCharacter.isWord = true;      
   
        
//         Node currentNode = node;
//         for (int i = 0; i < word.length(); i++) {
//             char currentChar = word.charAt(i);
//             if (!currentNode.children.containsKey(currentChar)) {
//                 currentNode.children.put(currentChar, new Node());
//             }
//             currentNode = currentNode.children.get(currentChar);
//         }
//         currentNode.isWord = true;
        
    }
    
    public boolean search(String word) {
         Node currentCharacter = node; 
        for(int i= 0; i<word.length(); i++){
             if(currentCharacter.children.containsKey(word.charAt(i))){
                 currentCharacter =  currentCharacter.children.get(word.charAt(i)); 
             }else{
              return false; 
             }
        }
        
        return currentCharacter.isWord;
        
        
    }
    
    public boolean startsWith(String word) {
         Node currentCharacter = node; 
        for(int i= 0; i<word.length(); i++){
             if(currentCharacter.children.containsKey(word.charAt(i))){
                 currentCharacter =  currentCharacter.children.get(word.charAt(i)); 
             }else{
              return false; 
             }
        }
        
        return true;
    
        
    }
    
   
    
    
    class Node{
        HashMap<Character, Node> children;  
        boolean isWord; 
        public Node(){
         children = new HashMap<>(); 
         isWord = false;
        }
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */