/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes {
    private Node headReference;

    /**
      Construct an empty list
     */


    /**
      @return the number of elements in this list
     */
     public int size() {
         int count = 0;
         Node current = headReference;
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

         Node current = headReference;
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
         this.headReference = new Node(val, headReference);
         return true;
     }

    public boolean add(int index, Object value) {
        if (index == 0) {
            return addAsHead(value);
        } else {
            int count = 0;
            Node current = headReference;
            while (current != null) {
                count++;
                if (count == index) {
                    current.setReferenceToNextNode(new Node(value, current.getReferenceToNextNode()));
                    return true;
                }
                current = current.getReferenceToNextNode();
            }
        }
        return false;
    }

    public Object get(int index) {
        if (index == 0) {
            return headReference.getCargoReference();
        } else {
            int count = 0;
            Node current = headReference;
            while (current != null) {
                if (count == index) {
                    return current.getCargoReference();
                }
                count++;
                current = current.getReferenceToNextNode();
            }
        }
        return null; // yikes
    }

    public void set(int index, Object value) {
        if (index == 0) {
            this.headReference = new Node(value, this.headReference.getReferenceToNextNode());
        } else {
            int count = 0;
            Node current = headReference;
            while (current != null) {
                if (count == index - 1) {
                    current.setReferenceToNextNode(new Node(value, current.getReferenceToNextNode().getReferenceToNextNode()));
                }
                count++;
                current = current.getReferenceToNextNode();
            }
        }
    }

    public Object remove(int index) {
        if (index == 0) {
            Node temp = this.headReference;
            this.headReference = this.headReference.getReferenceToNextNode();
            return temp.getCargoReference();
        } else {
            int count = 0;
            Node current = headReference;
            while (current != null) {
                if (count == index - 1) {
                    Node temp = current.getReferenceToNextNode();
                    current.setReferenceToNextNode(current.getReferenceToNextNode().getReferenceToNextNode());
                    return temp.getCargoReference();
                }
                count++;
                current = current.getReferenceToNextNode();
            }
        }
        return null; // yikes
    }
}
