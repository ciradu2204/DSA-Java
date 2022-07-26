 
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) { 
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]); 
        int remove = 1; 
        if(intervals.length == 0 || intervals.length == 1){
         return 0; 
        }
        int prev = 0; 
        for(int i=1; i<intervals.length; i++){
      
            if(intervals[i][0] >= intervals[prev][1]){
                prev = i; 
                remove++; 
            }
     
        }
        
        return intervals.length - remove; 
    }
    
    /*
    prev = 0; 
    Given: [[1,2],[2,3],[3,4],[1,3]]
            [1,2],[1, 3] [2,3][3,4]
            
     [[1,11] , [11,22],        
    Output: 1
     prev c  d  next
    [1, 2][2,3][3, 4]
    
    Alg: 
    1.Sort the array 
    2. if (c >= a && c < b) && if(d > next && d <= next)
    3. if(index == 0)
    
    
     
    
    */
}