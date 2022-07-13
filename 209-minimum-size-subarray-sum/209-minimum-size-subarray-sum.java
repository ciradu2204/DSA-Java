class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE; 
         if(nums.length == 0) return 0; 
        int counter = 0;
        int p1 = 0; 
        int p2 = 0; 
        while (p2 < nums.length){

            counter += nums[p2++]; 
            
            while (counter >= target){
                minSize = Math.min(minSize, p2-p1); 
                counter -= nums[p1++]; 
            }
        }
        return (minSize == Integer.MAX_VALUE)? 0: minSize;  
    }
    
    
    /*
    contigous -> subarray => sliding window
    Given: 
    target: 11
    int counter:  2 + 3 + 4 + 5
    int length: 3
    ArrayOfNums = [1,2,3,4,5]
                     p1 
                           p2
                         
                         
    Alg: 2 pointers 
    1. counter, minSize
    2. if(counter < target ) p2++
    3. else 
       3.a (counter >= target) 
           minSize = min(minSize, p2-p1+1)
           counter - p1;
           p1++;
    4. 
    */
}