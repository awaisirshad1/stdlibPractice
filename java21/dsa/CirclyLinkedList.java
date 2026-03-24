package java21.dsa;

public class CirclyLinkedList {
    private Node tail = null;
    public void addNode(int dataArg){
        Node newNode = new Node(dataArg);
        if(tail == null){
            tail = newNode;
            tail.next = tail;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        if (tail == null){
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(+current.data+" -> ");
            current = current.next;
        } while(current!=tail.next);
        System.out.println(current.data);
        System.out.println("Back to start");
    }

    public static void main(String[] args) {
        CirclyLinkedList list = new CirclyLinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println("Circular Linked List:");
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> (back to start)
    }
}
