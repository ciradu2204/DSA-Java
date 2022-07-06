class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<>(); 
        for(int i=0; i<nums.length; i++){
          if(i== 0 || (i>0 && nums[i] != nums[i-1])){
            int p1 = i+1; 
            int p2 = nums.length - 1; 
            int difference = 0 - nums[i]; 
            while(p1 < p2){
                   if(nums[p1] + nums[p2]  < difference){
                         p1++; 
                 
                   }else if(nums[p1] + nums[p2]  == difference){
               
                List<Integer> subResult= Arrays.asList(nums[i], nums[p1], nums[p2]);   
                     result.add(subResult); 
                      while( p1 < p2 && nums[p1] == nums[p1+1]) p1++; 
                     while(p1 < p2 && nums[p2] == nums[p2-1]) p2--;
                     p1++; 
                     p2--; 
                  }else{
                    p2--; 
                  }  
                    
              
                 
            }
    
        }
        
        /* 
             
        [-4,-1,-1,0, 1, 2]     
             i  
                  p1 p2
             
             0 - -1 = 1
             
             [-1, -1, 2] , [-1, 0, 1], 
        
        */
        } 
    return result; 
    }
}
 

// public List<List<Integer>> threeSum(int[] num) {
//     Arrays.sort(num);
//     List<List<Integer>> res = new LinkedList<>(); 
//     for (int i = 0; i < num.length-2; i++) {
//         if (i == 0 || (i > 0 && num[i] != num[i-1])) {
//             int lo = i+1, hi = num.length-1, sum = 0 - num[i];
//             while (lo < hi) {
//                 if (num[lo] + num[hi] == sum) {
//                     res.add(Arrays.asList(num[i], num[lo], num[hi]));
//                     while (lo < hi && num[lo] == num[lo+1]) lo++;
//                     while (lo < hi && num[hi] == num[hi-1]) hi--;
//                     lo++; hi--;
//                 } else if (num[lo] + num[hi] < sum) lo++;
//                 else hi--;
//            }
//         }
//     }
//     return res;
// }}