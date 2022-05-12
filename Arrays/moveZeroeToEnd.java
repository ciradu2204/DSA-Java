public class moveZeroeToEnd {

    /**
     * LeetCode - 283: https://leetcode.com/problems/move-zeroes/
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
       Note that you must do this in-place without making a copy of the array.
     */

    public static void main(String[] args) {

      int[] arr = {0,1,0,3,12}; 
      int[] result = Solution(arr); 

      //print result 
      for(int i=0; i<result.length; i++){
          System.out.println(result[i]);
      }
        
    }

    public static int[] Solution(int[] nums){
               
        //edge cases 
        
        if( nums == null || nums.length == 0 ){
            return nums; 
        }
        
        int pointerStart = 0; 
        int pointerEnd = 1; 
     while(pointerEnd < nums.length){
      
      if(nums[pointerStart] == 0 && 
         nums[pointerEnd] != 0){

          int temp = nums[pointerStart]; 
          nums[pointerStart] = nums[pointerEnd]; 
          nums[pointerEnd] = temp;
          
          pointerStart++; 
       }else if(nums[pointerStart] != 0) {
         pointerStart++;
      }
         
      pointerEnd++;

       
    }

    return nums; 
    }
    
}
