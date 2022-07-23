class SortComparable implements Comparator<int[]>{
    
    @Override
    public int compare(int[] a, int[] b){
        if(a[0] < b[0]){
            return -1; 
        }else if(a[0] == b[0]){
            return 0; 
        }else{
            return 1; 
        }
    }
}

class Solution {
    public int[][] merge(int[][] intervals) { 
        SortComparable sortComparable = new SortComparable();
        Arrays.sort(intervals, sortComparable);
        int row = intervals.length; 
        int column = intervals[0].length;
        List<int[]> result = new ArrayList<>();
        result.add( intervals[0]); 
        int currentIndex = 0;
      for(int i=1; i<intervals.length; i++){
        if(intervals[i][0] <= result.get(currentIndex)[1]){
    result.set(currentIndex, new int[]{result.get(currentIndex)[0], Math.max(intervals[i][1], result.get(currentIndex)[1])});
        }else{
            currentIndex++;
            result.add(intervals[i]);
        }
            
            
        }   
        int[][] finalResult = new int[result.size()][result.size()];
        return result.toArray(finalResult);
    }
    
    /* 
    
    a - b
      c       d
      
     [[1, 3] ]
        x
      a b   c d
    [[2,6],[8,10],[15,18]]
             i 


    
    
    1. create a new array, index =  current elemtn
    2. if( c <= a && c <=b) => overlap 
    3. if(i > 0) => 
    4. 
    
    */
}