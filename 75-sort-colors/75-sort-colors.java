class Solution {
    public void sortColors(int[] nums) {
        
        int[] count = new int[3]; 
        
        for(int i=0; i<nums.length; i++){
            int currentElement = nums[i]; 
             count[currentElement] +=1;  
        }
        
  
        int index = 0;
        for(int i=0; i<count.length; i++){
            int times = count[i]; 
            while(times > 0){
               nums[index++] = i; 
               times--; 
            }
        }
    
        
    }
    
    /*
    
    Given an array:   [1,0, 2, 1, 1, 1]
    sort them in place 
    
    1,0, 2, 1, 1, 1
    p1            p2
    
    Alg: 
    
    1. when p1 > p2: swap 
    2. if(p2 == 2){
       decrement p2
       }
       
    3. if(p1 == 0){
        p1++
       }
     
    
    */
}