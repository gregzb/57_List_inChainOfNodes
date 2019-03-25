/**
  Test the Node_recursive
 */

public class UserOfNode {
    public static Node_while chain;

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Test Node_recursive");

         // minimal Node_recursive, with no next node
         System.out.println( "minimal Node_recursive, with no next node");
        Node_while noNext=  new Node_while( new String( "mango")); // avoid interning
         System.out.println( noNext
                           + System.lineSeparator());

         // node with a reference, testing accessors
         System.out.println( "node with a reference, testing accessors");
        Node_while nextSet = new Node_while(  1.618); // autobox to Double
         nextSet.setReferenceToNextNode( noNext);
         System.out.println( nextSet
                           + System.lineSeparator());

         // 2-arg constructor obviates setReferenceToNextNode
         System.out.println(
             "2-arg constructor obviates setReferenceToNextNode");
        Node_while twoArgCon = new Node_while( new String( "kiwi"), nextSet);
         System.out.println( twoArgCon
                           + System.lineSeparator());
    }
}
