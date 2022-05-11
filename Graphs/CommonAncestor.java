import java.util.HashSet;
import java.util.List;
public class CommonAncestor {


    public static void main(String[] args) {

 
        
    }


    public static AncestralTree getYoungestCommonAncestor( AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo){

        	
		HashSet<Character> visited = new HashSet<>(); 
		
		AncestralTree descendantOneCurrent = descendantOne; 
		while(descendantOneCurrent != null){
			visited.add(descendantOneCurrent.name); 
			descendantOneCurrent = descendantOneCurrent.ancestor;
		}
		
		AncestralTree descendantTwoCurrent = descendantTwo;
		while(descendantTwoCurrent != null){

			if(visited.contains(descendantTwoCurrent.name)){
				return descendantTwoCurrent;
			}
			
			descendantTwoCurrent = descendantTwoCurrent.ancestor;
		}
    return topAncestor;

    }
    

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;
    
        AncestralTree(char name) {
          this.name = name;
          this.ancestor = null;
        }
    
        // This method is for testing only.
        void addAsAncestor(List<AncestralTree> descendants) {
          for (AncestralTree descendant : descendants) {
            descendant.ancestor = this;
          }
        }
      }
}
