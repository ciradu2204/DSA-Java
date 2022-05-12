import java.util.HashMap;;

public class meetingPlanner {


    public static void main(String[] args) {

        int[][] slotsA = {{10, 50}, {60, 120}, {140, 210}};
        int[][] slotsB = {{0, 15}, {60, 70}};
        int dur = 8; 
        int[] result  = Solution(slotsA, slotsB, dur ); 
        System.out.println(result[0]);
        System.out.println(result[1]);

        
    }


    public static  int[] Solution(int[][] slotsA, int[][] slotsB, int dur){
          
     int a = 0; 
     int b = 0; 

     while(a < slotsA.length && b<slotsB.length){

        int start = Math.max(slotsA[a][0], slotsB[b][0]); 
        int end = Math.min(slotsA[a][1], slotsB[b][1]); 

        //check if we have gone if there is a slot 
        if(start + dur <= end){
            int[] result = new int[2]; 
            result[0] = start; 
            result[1] = start + dur; 
            return result;
        }

        if(slotsA[a][0] > slotsB[b][0]){
            b++; 
        }else{
           a++; 
        }

        
     }


     return new int[0]; 

   }
  

    
    
}
