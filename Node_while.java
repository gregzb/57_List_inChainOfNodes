/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node_while {
    private Object cargoReference;
    private Node_while referenceToNextNodeRecursive;

    /**
      Construct an instance
     */
    public Node_while(Object cargoReference) {
        this(cargoReference, null);
    }
     public Node_while(Object cargoReference, Node_while referenceToNextNodeRecursive) {
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

        return result;
    }

     // classic accessor and mutator
     public Node_while getReferenceToNextNode() {
        return referenceToNextNodeRecursive;
     }

     public void setReferenceToNextNode( Node_while referenceToNextNodeRecursive) {
        this.referenceToNextNodeRecursive = referenceToNextNodeRecursive;
     }
    
     public Object getCargoReference() {
        return cargoReference;
     }
}