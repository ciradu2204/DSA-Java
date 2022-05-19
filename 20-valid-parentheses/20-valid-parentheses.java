class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>(); 
        
        for(int i=0; i<s.length(); i++){
           char currentChar = s.charAt(i);

            
            if(currentChar == ')' || currentChar == ']' || currentChar == '}'){
                
                if(stack.isEmpty()){
                    return false;
                }else if(currentChar == ']' && stack.peek() != '[' ){
                    return false;
                }else if(currentChar == '}' && stack.peek() != '{'){
                    return false;
                }else if(currentChar == ')' && stack.peek() != '('){
                    return false;
                }else{
                    stack.pop(); 
                }
                
            }else{
                stack.push(currentChar); 
            }
                
          
    }
    return stack.isEmpty();
}}