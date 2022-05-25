class Solution {
    public int numIslands(char[][] grid) {
    //time complexity: O(m,n) or O(v, e)  
    // space complexity: O(m, n ) - keep track of the time 
    
    int  rowLength = grid.length;
    int  columnLength = grid[0].length; 
    boolean[][] visited = new boolean[rowLength][columnLength];
    
    for(int i=0; i<rowLength; i++){
      
      for(int x=0; x<columnLength; x++){
             visited[i][x] = false; 
      }
    }
    
    
    int nIsland = 0; 
    
    for(int i=0; i<rowLength; i++){
      
      for(int x=0; x<columnLength; x++){
         
          if(grid[i][x] == '1' && visited[i][x] == false){

            int loc[] = {i, x};
            BFS(loc, grid, visited); 

            nIsland++; 
          }
      }
    }
    
    return nIsland; 
        
    }
    
    public static void BFS(int[] loc, char[][] binaryMatrix, boolean[][] visited){
 
    Queue<int[]> queue = new LinkedList<>(); 

    visited[loc[0]][loc[1]] = true;
    queue.add(loc); 
    
    int  rowLength = binaryMatrix.length;
    int  columnLength = binaryMatrix[0].length; 
    
    while(!queue.isEmpty()){
      int[] currentLoc = queue.poll();
      
      // Top, right, bottom, left

       int row = currentLoc[0]; 
       int column = currentLoc[1]; 
       visited[row][column] = true;

       addToQueue(row-1, column,binaryMatrix,  queue, visited); 
       addToQueue(row+1, column, binaryMatrix, queue, visited);
       addToQueue(row, column-1, binaryMatrix, queue, visited);
       addToQueue(row, column+1,binaryMatrix, queue, visited);


     
    }
  }
    
 public static void addToQueue(int row, int column, char[][] binaryMatrix, Queue<int[]> queue,  boolean[][] visited){
       int  rowLength = binaryMatrix.length;
    int  columnLength = binaryMatrix[0].length;
     
     if(row >=0 && row <rowLength && column >=0 && column < columnLength && visited[row][column] == false && binaryMatrix[row][column] == '1' ){
         queue.add(new int[]{row, column});
         visited[row][column] = true;
     }
 }
}