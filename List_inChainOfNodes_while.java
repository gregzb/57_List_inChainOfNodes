/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_while {
    private Node_while headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
     public int size() {
         int count = 0;
         Node_while current = headReference;
         while (current != null) {
             count++;
             current = current.getReferenceToNextNode();
         }
         return count;
     }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
     public String toString() {
         String temp = "";

         Node_while current = headReference;
         while (current != null) {
             temp += current + " --> ";
             current = current.getReferenceToNextNode();
         }

         temp += "[no next]";

         return temp;
     }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
         this.headReference = new Node_while(val, headReference);
         return true;
     }
}