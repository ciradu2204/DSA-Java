class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list = new ArrayList<>(); 

      List<Integer> subset = new ArrayList<>(); 
        
       dfs(nums, list, 0, subset); 
        
       return list; 
        
    }
    
    public void dfs(int[] nums, List<List<Integer>> list, int currentIndex,List<Integer> subset){
        
         if(currentIndex >=nums.length){
             //System.out.println(newArrayL );
             list.add(new ArrayList<>(subset));  
             return; 
         }
        
        //the first decision is to add the element
         subset.add(nums[currentIndex]);
         dfs(nums, list, currentIndex + 1, subset); 
        
        //the second decision is to remove the element
         subset.remove(subset.size() -1); 
         dfs(nums, list, currentIndex + 1, subset); 
  
    }
    
    //[,,,,[],[1],,,]
    //[[],,,[1,2],,,,]
}