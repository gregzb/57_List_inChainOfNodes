/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursive {
    private Node_recursive headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
     public int size() {
         return headReference == null ? 0 : headReference.size();
     }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
     public String toString() {
         String referenceString = headReference == null ? "" : headReference.toString();
         return size() + " elements [" + referenceString + "]";
     }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
         this.headReference = new Node_recursive(val, headReference);
         return true;
     }
}