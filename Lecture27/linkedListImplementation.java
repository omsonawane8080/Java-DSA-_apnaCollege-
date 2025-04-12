import java.util.LinkedList;

class linkedListImplementation {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // Add elements to the list
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");

        // Print the list
        System.out.println("Initial list: " + list);

        // Access and print first element
        System.out.println("First element: " + list.get(0));

        // Print size of the list
        System.out.println("List size: " + list.size());

        // Remove elements from specific positions
        list.remove(3);         // Removes "linked"
        list.removeFirst();     // Removes "this"
        list.removeLast();      // Removes "list"

        // Print the final list
        System.out.println("Final list: " + list);
    }
}
