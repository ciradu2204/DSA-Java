class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; 
        result[0] = 1; 
        for(int i=1; i<nums.length; i++){
            int product = nums[i-1] * result[i-1];
            result[i] = product; 
        }
        int prev = 1; 
        for(int i= nums.length-2; i>=0; i--){
            int rightProduct = prev * nums[i+1]; 
            prev = rightProduct; 
            int totalProduct = rightProduct * result[i];
            result[i] = totalProduct; 
        }
        return result; 
    }
    
    
    /* 
    
    */
}