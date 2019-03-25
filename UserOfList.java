/**
 * Test list features.
 */
public class UserOfList {
    public static void main(String[] args) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println("number of elements: " + list.size());

        // the spec requests that toString include the size
        System.out.println("empty list: " + list
                + System.lineSeparator());

         /* Populate the list with elements.
            Create the test data in an array, for the programming
            convenience of being able to loop through it.
         */
        String[] elements = new String[]{"y", "u", "t", "S",};
             /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
                for convenient way to init an array of Strings */
        for (String elem : elements) {
            list.addAsHead(elem);
            System.out.println("number of elements: " + list.size());
        }
        System.out.println("populated list: " + list
                + System.lineSeparator());

        list.remove(2);

        System.out.println(list);

        list.set(0, "G");

        System.out.println(list);

        System.out.println(list.get(1));

        list.add(3, "R");

        System.out.println(list);

//        list = new List_inChainOfNodes();
//
//        for (int i = 0; i < 10; i++) {
//            list.addAsHead(i);
//        }
//
//        String myString = list.toString();
    }
}
