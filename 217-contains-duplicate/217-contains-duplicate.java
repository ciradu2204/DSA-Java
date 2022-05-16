class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //testing
        //Hashmap : {1: 2, 2:1, 3:1, }
        
        //check if the array is not empty and then false
        
         if(nums.length == 0){
             return false; 
         }
        
//          //Hashmap 
        
//          HashMap<Integer, Integer> map = new HashMap<>(); 
        
//         for(int i=0; i<nums.length; i++){
            
//             if(map.containsKey(nums[i])){
//               map.put(nums[i], map.get(nums[i]) + 1); 
//             }else{
//                map.put(nums[i], 1); 
//             }
//         }
        
//         for(Integer value: map.values()){
//             if(value > 1){
//                 return true; 
//             }
//         }
        
//         return false; 
        
        
        //second solution
        HashSet<Integer> set = new HashSet<>(); 
        
        for(int i=0; i<nums.length; i++){
            
            if(set.contains(nums[i])){
                return true; 
            }else{
                set.add(nums[i]); 
            }
        }
        
        return false; 
        
        
        
        
    }
    

}