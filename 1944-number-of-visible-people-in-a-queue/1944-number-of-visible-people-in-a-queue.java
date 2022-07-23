class Pair{
    int position; 
    int value; 
    public Pair(int position, int value){
       this.position = position; 
       this.value = value; 
    }
}
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Pair> stack = new Stack<>(); 
        int[] result = new int[heights.length]; 
       for(int i=0; i < heights.length; i++){
        while(!stack.isEmpty() && heights[i] > stack.peek().value){
             Pair current = stack.pop();
             result[current.position] +=1; 
         }
            
        if(!stack.isEmpty()){
            result[stack.peek().position] += 1; 
        }
            
        stack.push(new Pair(i,heights[i])); 
        
        
        }  
      
        
        return result;
    }
    
    /*         3  1 2 1
    heights = [10,6,8,5,11,9]
      
     [11 ]
                      
                            
    int value = 6
    int decrease = 1
    stack = {10, }
    result = [          ,0]
    Alg: 
    
    1. if (currentElement > stack.peek()) -> pop the eleme
    2. if (currentElement < stack.peek()) ->  increment
    
    
    */
}