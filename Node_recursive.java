/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node_recursive {
    private Object cargoReference;
    private Node_recursive referenceToNextNodeRecursive;

    /**
      Construct an instance
     */
    public Node_recursive(Object cargoReference) {
        this(cargoReference, null);
    }
     public Node_recursive(Object cargoReference, Node_recursive referenceToNextNodeRecursive) {
         /* For incremental development with the skeleton's UserOfNode,
            postpone writing this constructor until after the accessors.
            Then remove this comment, of course.
          */

         this.cargoReference = cargoReference;
         this.referenceToNextNodeRecursive = referenceToNextNodeRecursive;
     }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        String result =
            cargoReference.toString()  // polymorphically use appropriately toString!
          + " id " // include a usually-unique identifier for this node
          + super.toString()
          ;

        // Show rest of chain of nodes
        if( referenceToNextNodeRecursive == null)
             result += " [no next]";
        else result += " --> " + referenceToNextNodeRecursive;
        return result;
    }

     // classic accessor and mutator
     public Node_recursive getReferenceToNextNode() {
        return referenceToNextNodeRecursive;
     }

     public void setReferenceToNextNode( Node_recursive referenceToNextNodeRecursive) {
        this.referenceToNextNodeRecursive = referenceToNextNodeRecursive;
     }
    
     public Object getCargoReference() {
        return cargoReference;
     }

     public int size() {
        return 1 + (referenceToNextNodeRecursive == null ? 0 : referenceToNextNodeRecursive.size());
     }
}