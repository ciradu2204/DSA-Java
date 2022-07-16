class Solution {
    public void sortColors(int[] nums) {
        
        
//         bucket sort or count sort
//         int[] count = new int[3]; 
        
//         for(int i=0; i<nums.length; i++){
//             int currentElement = nums[i]; 
//              count[currentElement] +=1;  
//         }
        
  
//         int index = 0;
//         for(int i=0; i<count.length; i++){
//             int times = count[i]; 
//             while(times > 0){
//                nums[index++] = i; 
//                times--; 
//             }
//         }
        
        // using two pointers 
        int start =  0  ; 
        int end = nums.length -1; 
        int index = 0;
        
        while( index <=end &&  start <= end ){
            
            if(nums[index] == 0){
                nums[index] = nums[start]; 
                nums[start] =  0; 
                start++; 
                index++;
            }else if(nums[index] == 2){
                nums[index] = nums[end]; 
                nums[end] = 2; 
                end--; 
                //we won't icrement the index because nums[end] could be a zero   
            }else{
                index++; 
            }
            
        }
    
        
    }
    
    /*
    
    Given an array:   [1,0, 2, 1, 1, 1]
    sort them in place 
    
    [1,0,2]
     p1 
       p2
       i
     
    
    */
}