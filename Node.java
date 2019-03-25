/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node {
    private Object cargoReference;
    private Node referenceToNextNodeRecursive;

    /**
      Construct an instance
     */
    public Node(Object cargoReference) {
        this(cargoReference, null);
    }

     public Node(Object cargoReference, Node referenceToNextNodeRecursive) {
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
     public Node getReferenceToNextNode() {
        return referenceToNextNodeRecursive;
     }

     public void setReferenceToNextNode( Node referenceToNextNodeRecursive) {
        this.referenceToNextNodeRecursive = referenceToNextNodeRecursive;
     }

     public Object getCargoReference() {
        return cargoReference;
     }
}
