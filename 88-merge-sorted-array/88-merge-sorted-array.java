class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n]; 
        if(nums1.length == 0 && nums2.length == 0){
            return; 
        }else if(nums1.length == 0 && nums2.length != 0){
           nums1 = nums2; 
            return; 
        }else if(nums1.length != 0 && nums2.length == 0){
          return; 
        }
        int p1 = 0; 
        int p2 = 0;
        int currentIndex = 0; 
        while(p1 < m && p2 < n){
            if(nums1[p1] < nums2[p2]){
                result[currentIndex++] = nums1[p1++];              
            }else if(nums1[p1] == nums2[p2]){
                result[currentIndex++] = nums1[p1++]; 
                result[currentIndex++] = nums2[p2++]; 
            }else{
                result[currentIndex++] = nums2[p2++]; 

            }
            
        }
        while(p2 < n){
          result[currentIndex++] = nums2[p2++]; 
        }
         while(p1 < m){
          result[currentIndex++] = nums1[p1++]; 
        }     
        for(int i=0; i<result.length; i++){
            nums1[i] = result[i];
        }    
    }
    
    /*
    int nums1 = [1, 2, 3, 0, 0 , 0] m=3 
    int nums2 = [2,5, 6] n=3
    
    [1, 2, 3, 0, 0, 0]     [1, 2, 2, 3 ]
             p1
    
    [2,5, 6]
      p2
    
    Alg: 
    1. create a new array with length = n + m 
    2. if(p1< p2) -> add nums[p1]; p1++
    3. if(p1 == p2) -> add both; p1++; p2++; 
    4.  if(p2 < p1) -> add nums[p2]; p2++
    5.  if(p2 < n) _> add all rem elements
    6. if(p1 < m)  -> add all rem elements fr
    
    
    
    
    */
}