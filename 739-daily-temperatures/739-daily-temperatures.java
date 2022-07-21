class Pair{
   int position; 
   int value; 
   public Pair(int position, int value){
       this.position = position; 
       this.value = value;
   }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      Stack<Pair> stack = new Stack<>(); 
      stack.push(new Pair(0, temperatures[0]));
      int[] result = new int[temperatures.length]; 
      for(int i=1; i<temperatures.length; i++){
          while(!stack.isEmpty()  && temperatures[i] >  stack.peek().value ){
             Pair removed = stack.pop();
             result[removed.position] = i-removed.position;  
          }
     
          stack.push(new Pair(i, temperatures[i]));
      }
        
    
      return result;
    
    /*
   
    Input temp =  [73,74,75,71,69,72,76,73]
    stack : {76, 73 }
    
    
    Alg: O(n2)
    1. initialize an array of same length
    2. 
    
    Alg: O(n)
      
    */
}}